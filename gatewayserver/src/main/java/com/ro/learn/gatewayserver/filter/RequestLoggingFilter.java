package com.ro.learn.gatewayserver.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class RequestLoggingFilter extends AbstractGatewayFilterFactory {

    final Logger logger =
            LoggerFactory.getLogger(RequestLoggingFilter.class);

    @Override
    public GatewayFilter apply(Object config) {
        return (exchange, chain) -> {

            logger.info("Calling : " + exchange.getRequest().getPath());
            return chain.filter(exchange);
        };
    }
}
