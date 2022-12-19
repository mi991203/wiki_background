package com.jiawa.wiki;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.Test;

import java.util.Collections;

public class MybatisPlusGenerator {
    @Test
    public void generateCode() {
        FastAutoGenerator.create("jdbc:mysql://192.168.137.10:3306/wiki", "root", "sh19991203")
                .globalConfig(builder -> {
                    builder
//                            .author("") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\code_file\\java\\wiki\\wiki_background\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.jiawa.wiki") // 设置父包名
//                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D:\\code_file\\java\\wiki\\wiki_background\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("ebook", "category", "content", "doc", "ebook_snapshot", "user"); // 设置需要生成的表名
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
