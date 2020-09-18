package com.ro.learn.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerApplication.class, args);
	}

/*	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("path_route", r -> r.path("/order-api").uri("http://order-service"))
				.route("path_route", r -> r.path("/inventory-api").uri("http://inventory-service"))
				.route("path_route", r -> r.path("/price-api").uri("http://price-service"))
				.build();
	}*/
}
