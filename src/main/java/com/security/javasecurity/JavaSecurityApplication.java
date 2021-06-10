package com.security.javasecurity;


import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.service.ApiInfo;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class JavaSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSecurityApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.security"))
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
        return new ApiInfo(
                "Java Swagger API",
                "Testing the Application",
                "1.0 ",
                "free to use",
                "", "license",
                "licenseUrl");
    }
	
}
