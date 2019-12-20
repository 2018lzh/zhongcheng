package com.joinChain.medicalCare;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.ApiOperation;
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

	@Value("${swagger2.enable}")
	private boolean swagger2;
	
	@Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("test")
                .apiInfo(getApiInfo())
                //设置是否启用swagger2接口文档
                .enable(swagger2)
                .select()
                //设置basePackage会将包下的所有被@Api标记类的所有方法作为api
                .apis(RequestHandlerSelectors.basePackage("com.joinChain.medicalCare.system.controller"))
                //只有标记了@ApiOperation的方法才会暴露出给swagger
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                //.paths(PathSelectors.regex("/api/.*"))
                .build();
     }
	
	private ApiInfo getApiInfo(){
        return new ApiInfoBuilder()
                .title("API接口文档")
                .description("测试接口")
                .termsOfServiceUrl("http://localhost:8088/personal/doc.html")
                .version("1.0")
                .contact(new Contact("lzh", "http://localhost:8088/personal/doc.html", "1820120021@qq.com"))
                .build();
    }

}
