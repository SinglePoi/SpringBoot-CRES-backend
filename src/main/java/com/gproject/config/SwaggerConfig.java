package com.gproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket defaultApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(groupApiInfo())
                .groupName("默认接口")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gproject.controller"))
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo groupApiInfo(){
        return new ApiInfoBuilder()
                .title("API文档")
                .description("swagger-bootstrap-ui-demo RESTful APIs")
                .termsOfServiceUrl("http://www.group.com/")
//                .contact("group@qq.com")
                .version("1.0")
                .build();
    }

}
