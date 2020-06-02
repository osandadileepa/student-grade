package com.osanda.studentgrade.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * add cross origin for all the custom created end points
 * 
 * @author Osanda Wedamulla
 *
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Value("${spring.data.rest.base-path}")
	private String basePath;

	@Override
	public void addCorsMappings(CorsRegistry registry) {

		registry.addMapping(String.format("%s/**", basePath)).allowedOrigins("*").allowedMethods("*")
				.allowedHeaders("*");
	} // addCorsMappings()

}
