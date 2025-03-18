package com.dh.supplier_data_service.repository;


import com.dh.supplier_data_service.model.SupplierDTO;

import java.util.List;
import java.util.Optional;

public interface ISupplierRepository {

    Optional<SupplierDTO> findById(String id);

    List<SupplierDTO> findByUsername(String username);
}
