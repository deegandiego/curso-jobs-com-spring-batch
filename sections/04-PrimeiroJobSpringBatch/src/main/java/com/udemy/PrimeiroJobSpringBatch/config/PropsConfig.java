package com.udemy.PrimeiroJobSpringBatch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class PropsConfig {

	@Bean
	public PropertySourcesPlaceholderConfigurer config() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		/*change path to your location or actually use project application.properties*/
		configurer.setLocation(new FileSystemResource("D:/git/curso-jobs-com-spring-batch/config/application.properties"));
		return configurer;
	}
}