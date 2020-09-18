### Kuppi-SpringCloud
**Note:** Resources are for the KT session on Spring Cloud.

The purpose of this code is to demonstrate a simple inventory management system implemented in micro-service architecture. The primary focus is on micro-service architecture. So I have not used any databases to keep the code simple.

Simple Inventory management system is built using 3 business components(price, inventory, and order). It has the following components to support micro-service architecture config-server, name-server, api-gatway, and tracing-server.

#### Directories
 - config -> Centralized configuration files.
 - configserver -> Spring Boot configuration server.
 - gatewayserver -> API Gateway
 - inventory -> Simple inventory management service for demo purposes.
 - nameserver -> Spring Boot Service Discovery backed by Eureka Server.
 - order -> Simple order management service for demo purposes.
 - price -> Simple price management service for demo purposes.
 - zipkinserver -> folder containing zipkin.jar for distributed tracing.
