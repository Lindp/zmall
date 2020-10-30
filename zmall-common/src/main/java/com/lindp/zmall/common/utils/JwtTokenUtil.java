package com.lindp.zmall.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;

/**
 * jwt token 工具类
 *
 * @author lindp
 * @date 2020/9/28
 */
@Component
@Slf4j
public class JwtTokenUtil {
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private Long expiration;

    /**
     * 生成 jwt token
     */
    public String createToken(Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(getExpirationDate())
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    /**
     * 验证token是否还有效
     *
     * @param token
     * @return 是否有效
     */
    public boolean validateToken(String token) {
        Claims claims = getClaimsFromToken(token);
        Date expiredDate = claims.getExpiration();
        return expiredDate.before(new Date());
    }

    /**
     * 从token中获取JWT中的负载
     */
    private Claims getClaimsFromToken(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            log.info("jwt 格式验证失败:{}", token);
        }
        return claims;
    }

    /**
     * 从token中获取登录用户名
     */
    public String getLoginNameFromToken(String token) {
        String loginName;
        try {
            Claims claims = getClaimsFromToken(token);
            loginName = claims.getSubject();
        } catch (Exception e) {
            loginName = null;
        }
        return loginName;
    }

    /**
     * 获取过期时间
     *
     * @return
     */
    public Date getExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }
}
