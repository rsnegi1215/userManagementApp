package com.example.userManagementApp.config;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket swagConfig() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.userManagementApp")).build()
				.apiInfo(getApiInfo()); // to get apiInfo
	}

	// API information for 3rd party with terms and condition.
	private ApiInfo getApiInfo() {

		return new ApiInfo("User Management REST API", "Documentaton for User Management for 3rd Party", "1.0",
				"Terms of service for using userManagementApp",
				new Contact("Ravindra Singh", "www.google.com", "rsnegi2005@gmail.com"), "MIT Licence",
				"https://opensource.org/licenses/MIT", new ArrayList<>());
	}

}
