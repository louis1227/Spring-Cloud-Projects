package com.louis.cloud.uaa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig  extends WebMvcConfigurerAdapter {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");		
		registry.addViewController("/oauth/confirm_access").setViewName("authorize");
	}
	
	
	 @Override
	  public void addCorsMappings(CorsRegistry registry) {
	    registry.addMapping("*")
	    .allowedOrigins("*")
	    .allowedHeaders("*")
	    .allowCredentials(true);
	  }
}


