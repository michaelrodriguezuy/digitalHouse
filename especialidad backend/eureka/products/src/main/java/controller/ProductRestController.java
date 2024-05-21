package controller;

import org.springframework.web.bind.annotation.RestController;

import model.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/products")
public class ProductRestController {
    

    @GetMapping()
    public Product getProduct(@RequestParam String id) {
        return new Product(id,"Product 1", 1000.0, "instance 1");
    }

}
