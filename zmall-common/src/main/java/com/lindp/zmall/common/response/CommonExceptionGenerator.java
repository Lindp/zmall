package com.lindp.zmall.common.response;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.lang.Dict;
import cn.hutool.extra.template.Template;
import cn.hutool.extra.template.TemplateConfig;
import cn.hutool.extra.template.TemplateEngine;
import cn.hutool.extra.template.TemplateUtil;

import java.io.BufferedOutputStream;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Restful 生成 java 异常类
 *
 * @author lindp
 * @date 2020/9/24
 */
public class CommonExceptionGenerator {

    /**
     * 生成的根目录位置
     */
    private static final String BASE_URL = "/Users/Lindp/Workspace/IdeaProjects/wishequ/wishequ-common/src/main/java/com/haitao/common/restfulres";

    public static void main(String[] args) {
        // 生成用户端异常
        buildJavaException("user", "A");
        // 生成服务端异常
        buildJavaException("server", "B");
        // 生成第三方异常
        buildJavaException("third", "C");
    }

    /**
     * 生成java异常类
     */
    private static void buildJavaException(String modelName, String codeStartWith) {
        Class<RestCodeEnum> restfulCodeEnumClass = RestCodeEnum.class;
        RestCodeEnum[] enumConstants = restfulCodeEnumClass.getEnumConstants();
        List<RestCodeEnum> userCodeEnums = Arrays.stream(enumConstants).filter(f -> f.getCode().startsWith(codeStartWith)).collect(Collectors.toList());

        userCodeEnums.forEach(i -> {
            TemplateEngine engine = TemplateUtil.createEngine(new TemplateConfig("/", TemplateConfig.ResourceMode.CLASSPATH));
            Template template = engine.getTemplate("/restful-exception-java.ftl");
            String result = template.render(Dict.create()
                    .set("modelName", modelName)
                    .set("comment", i.getMessage())
                    .set("javaName", i.name()));

            File targetFile = FileUtil.newFile(String.format("%s/%s/%s.java", BASE_URL, modelName, i.name()));
            BufferedOutputStream targetFileos = FileUtil.getOutputStream(targetFile);
            IoUtil.writeUtf8(targetFileos, true, result);
        });
    }
}
