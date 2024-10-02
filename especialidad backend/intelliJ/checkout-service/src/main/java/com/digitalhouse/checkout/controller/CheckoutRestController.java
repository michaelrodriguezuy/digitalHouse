package com.digitalhouse.checkout.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.checkout.model.Checkout;
import com.digitalhouse.checkout.service.ICheckoutService;

@RestController
@RequestMapping(value = "/checkout")
public class CheckoutRestController {
	private ICheckoutService checkoutService;

	public CheckoutRestController(ICheckoutService checkoutService) {
		super();
		this.checkoutService = checkoutService;
	}

	@GetMapping("/{id}")
	public Checkout getById(@PathVariable String id) {
		return new Checkout(id);		
	}

	@GetMapping()
public Checkout getCheckout(@RequestParam List<String> productIds, @RequestHeader("X-Custom-Header") String requestFrom, @RequestHeader() Map<String, String> headers) {
    System.out.println("Paso por el filtro: " + requestFrom);
    if (!requestFrom.equals("Gateway-Service")) {
        return null;
    }
    return checkoutService.buildCheckout(productIds);
}

}
