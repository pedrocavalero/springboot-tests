package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;

@Configuration
@EnableWebSecurity
public class BasicConfiguration extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors()
        .and()
          .authorizeRequests()
            .antMatchers(HttpMethod.GET, "/hello")
              .hasAuthority("ROLE_USER")
            .anyRequest()
              .authenticated()
        .and()
          .oauth2ResourceServer()
            .jwt()
              .jwtAuthenticationConverter(getJwtAuthenticationConverter());
    }
    
    JwtAuthenticationConverter getJwtAuthenticationConverter() {
    	JwtGrantedAuthoritiesConverter converter = new JwtGrantedAuthoritiesConverter();
    	converter.setAuthoritiesClaimName("authorities");
    	converter.setAuthorityPrefix("");
    	JwtAuthenticationConverter authenticationConverter = new JwtAuthenticationConverter();
    	authenticationConverter.setJwtGrantedAuthoritiesConverter(converter);
    	return authenticationConverter;
    }
}