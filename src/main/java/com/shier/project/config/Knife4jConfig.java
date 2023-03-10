package com.shier.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Knife4j 接口文档配置
 * https://doc.xiaominfo.com/knife4j/documentation/get_start.html
 *
 * @author shier
 */
@Configuration
@EnableSwagger2
@Profile("dev")
public class Knife4jConfig {

    @Bean
    public Docket defaultApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 指定 Controller 扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.shier.project.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    /**
     * 自定义接口文档信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("众享API开发接口系统接口文档") // 接口文档的标题
                .description("做一个提供API接口调用的平台，用户可以注册登录，开通接口调用权限。用户可以使用接口，并且每次调用会进行统计。管理员可以发布接口、下线接口、接入接口，以及可视化接口的调用情况、数据。") // 接口文档的描述信息
                .termsOfServiceUrl("https://github.com/kongshier") // 提供服务的是谁？可以填写你自己的地址因为是你自己提供的服务
                .contact(new Contact("shier", "https://blog.csdn.net/qq_56098191?spm=1000.2115.3001.5343", "2927527234@qq.com"))
                .version("1.0") // 版本
                .build(); // 构建
    }
}