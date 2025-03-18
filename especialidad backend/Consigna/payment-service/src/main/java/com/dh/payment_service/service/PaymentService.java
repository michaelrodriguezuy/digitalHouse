package com.dh.payment_service.service;

import com.dh.payment_service.repository.FeignSupplierRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private FeignSupplierRepository proveedorRepository;

    public PaymentService(FeignSupplierRepository subscriptionRepository) {
        this.proveedorRepository = subscriptionRepository;
    }

    public String paySupplier (String supplierName, Integer amount){
        String response= "payment processed";

        if(proveedorRepository.isInBlackList(supplierName)) {
            response= "payment error due to blocked supplier";
        }

        return response;
    }
}
