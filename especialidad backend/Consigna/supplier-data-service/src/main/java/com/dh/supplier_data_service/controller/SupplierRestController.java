package com.dh.supplier_data_service.controller;

import com.dh.supplier_data_service.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SupplierRestController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/supplier/blacklist/{name}")
    public boolean isInBlackList(@PathVariable String name){
        return supplierService.isInBlackList(name);
    }
}
