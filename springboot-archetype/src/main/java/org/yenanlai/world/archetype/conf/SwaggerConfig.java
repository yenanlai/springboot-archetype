package org.yenanlai.world.archetype.conf;

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
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)//
                .groupName("springboot-archetype")//
                .apiInfo(apiInfo())//
                .select()//
                .apis(RequestHandlerSelectors.basePackage("org.yenanlai.world.archetype"))//
                .paths(PathSelectors.any())//
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()//
                .title("Swagger Interface")//
                .description("数据交换格式: JSON")//
                .license("叶南来 2019 © All Rights Reserved")//
                .version("v2.0.0")//
                .build();
    }
}
