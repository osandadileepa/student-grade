package com.osanda.studentgrade.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

/**
 * add cross origin for spring data rest end points
 * 
 * @author Osanda Wedamulla
 *
 */

@Configuration
public class GlobalRepositoryRestConfigurer implements RepositoryRestConfigurer {

	@Value("${spring.data.rest.base-path}")
	private String basePath;

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		config.getCorsRegistry().addMapping(String.format("%s/**", basePath)).allowedOrigins("*").allowedMethods("*")
				.allowedHeaders("*");
	}// configureRepositoryRestConfiguration()

}
