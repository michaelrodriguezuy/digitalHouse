package com.digitalHouse.gateway.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

// anotamos la clase como un componente de spring
@Configuration
public class CustomFilter implements GlobalFilter {

    // vamos a logear el request
    Logger logger = LoggerFactory.getLogger(CustomFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        // dentro de exchange tenemos toda la informacion de la peticion, sacamos lo que
        // necesitemos

        logger.info("Solicitud hacia el servicio: {}", exchange.getRequest().getPath());

        return chain.filter(exchange); // continua con la cadena de filtros

    }

}
