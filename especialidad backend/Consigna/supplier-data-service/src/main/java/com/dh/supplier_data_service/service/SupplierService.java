package com.dh.supplier_data_service.service;

import com.dh.supplier_data_service.model.SupplierDTO;
import com.dh.supplier_data_service.repository.ISupplierRepository;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    private ISupplierRepository proveedorRepository;

    public SupplierService(ISupplierRepository userRepository) {
        this.proveedorRepository = userRepository;
    }

    public SupplierDTO findById (String id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    public boolean isInBlackList (String name){
        return !proveedorRepository.findByUsername(name).isEmpty();
    }
}
