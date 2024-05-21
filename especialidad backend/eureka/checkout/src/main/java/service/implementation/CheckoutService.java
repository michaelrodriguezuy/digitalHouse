package service.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import model.dto.Product;
import org.springframework.stereotype.Service;
import service.ICheckoutService;
import service.IProductService;

import model.Checkout;

@Service
public class CheckoutService implements ICheckoutService {

    private IProductService productService;

    public CheckoutService(IProductService productService) {
        this.productService = productService;
    }

    @Override
    public Checkout buildCheckout(List<String> productIds) {
        Double total = 0.0;

        for (String id : productIds) {
            Product product = productService.getProduct(id);
            total += product.getPrice();
        }
        Checkout checkout = new Checkout("234", "www.google.com/checkout?id=234", 
        total.toString(), List.of("CREDIT_CARD", "DEBIT_CARD"));

        return checkout;
    }
}