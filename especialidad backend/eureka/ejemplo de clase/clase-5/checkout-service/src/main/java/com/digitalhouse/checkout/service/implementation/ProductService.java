package com.digitalhouse.checkout.service.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.digitalhouse.checkout.model.dto.Product;
import com.digitalhouse.checkout.repository.FeignProductRepository;
import com.digitalhouse.checkout.service.IProductService;

import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ProductService  implements IProductService{
	
	private FeignProductRepository feignProductRepository;
	
	Logger logger = LoggerFactory.getLogger(ProductService.class);

	public ProductService(FeignProductRepository feignProductRepository) {
		super();
		this.feignProductRepository = feignProductRepository;
	}



	//este es el metodo que se va a llamar si el circuit breaker esta cerrado
	@Override
	@CircuitBreaker(name = "product", fallbackMethod = "getProductFallback")
	public Product getProduct(String id) {
	return feignProductRepository.getProductById(id, true);
	}

	//este es el metodo que se va a llamar si el circuit breaker esta abierto
	public Product getProductFallback(String id,  CallNotPermittedException ex) {
		logger.error("Circuit breaker abierto para el servicio de productos");
		return new Product();
	}


}
