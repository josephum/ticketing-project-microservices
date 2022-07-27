package com.cydeo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class,args);
    }

    //    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(p -> p
//                        .path("/cydeo/user/**")
//                        .filters(f -> f.rewritePath("/cydeo/user/(?<segment>.*)","/${segment}")
//                                .addResponseHeader("X-Response-Time",new Date().toString()))
//                        .uri("lb://user-service"))
//                .route(p -> p
//                        .path("/cydeo/project/**")
//                        .filters(f -> f.rewritePath("/cydeo/project/(?<segment>.*)","/${segment}")
//                                .addResponseHeader("X-Response-Time",new Date().toString()))
//                        .uri("lb://project-service"))
//                .route(p -> p
//                        .path("/cydeo/task/**")
//                        .filters(f -> f.rewritePath("/cydeo/task/(?<segment>.*)","/${segment}")
//                                .addResponseHeader("X-Response-Time",new Date().toString()))
//                        .uri("lb://task-service"))
//                .build();
//    }

}
