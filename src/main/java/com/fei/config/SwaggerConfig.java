package com.fei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 自行修改为自己的包路径
                /**
                 * .apis(RequestHandlerSelectors.basePackage("com.neo.xxx"))
                 * 指定需要扫描的包路径，只有此路径下的 Controller 类才会自动生成 Swagger API 文档。
                 */
                .apis(RequestHandlerSelectors.basePackage("com.fei.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("客户管理")
                .description("客户管理中心 API 1.0 操作文档")
                //服务条款网址
                .termsOfServiceUrl("http://localhost:8080/")
                .version("1.0")
                .contact(new Contact("纯洁的微笑", "http://localhost:8080/", "ityouknow@126.com"))
                .build();
    }
}