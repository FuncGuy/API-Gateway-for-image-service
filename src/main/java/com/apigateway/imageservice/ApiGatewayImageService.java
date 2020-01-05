package com.apigateway.imageservice;

import filters.ErrorFilter;
import filters.PostFilter;
import filters.PreFilter;
import filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableZuulProxy
@ComponentScan({"filters"})
public class ApiGatewayImageService {

    public static void main(String[] args) {

        SpringApplication.run(ApiGatewayImageService.class, args);
    }

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

}
