package com.louis.cloud.resource.config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.RestController;

@EnableResourceServer
@RestController
public class OAuthConfiguration extends ResourceServerConfigurerAdapter {

	 @Override  
     public void configure(HttpSecurity http) throws Exception {  
         // @formatter:off  
         http  
         	.csrf().disable()
         	.authorizeRequests()
         	.antMatchers("/","/webjars/**","/swagger-ui.html/**").permitAll()
         	.antMatchers("/**").authenticated()
         	.antMatchers(HttpMethod.GET,"/**").permitAll()
         	.antMatchers(HttpMethod.POST,"/**").access("hasRole('ROLE_ADMIN')")
         	.antMatchers(HttpMethod.PUT,"/**").access("hasRole('ROLE_ADMIN')")
         	.antMatchers(HttpMethod.DELETE,"/**").access("hasRole('ROLE_ADMIN')")
         	.antMatchers(HttpMethod.PATCH,"/**").access("hasRole('ROLE_ADMIN')")
            ;  
         // @formatter:on  
     }  
	
}
