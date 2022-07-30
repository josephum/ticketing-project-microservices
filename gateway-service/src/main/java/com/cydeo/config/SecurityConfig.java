package com.cydeo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.reactive.config.EnableWebFlux;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http){

        http.authorizeExchange(exchanges -> exchanges.pathMatchers("/cydeo/user/**").authenticated()
                        .pathMatchers("/cydeo/project/**").authenticated()
                        .pathMatchers("/cydeo/task/**").permitAll())
                .oauth2ResourceServer().jwt();

        http.csrf().disable();
        return http.build();

    }

}