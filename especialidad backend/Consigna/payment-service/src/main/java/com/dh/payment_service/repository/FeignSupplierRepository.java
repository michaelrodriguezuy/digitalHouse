package com.dh.payment_service.repository;


import com.dh.payment_service.configuration.feign.FeignInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="supplier-data-service", url="http://localhost:8083", configuration = FeignInterceptor.class)
public interface FeignSupplierRepository {

    @RequestMapping(method = RequestMethod.GET, value="/supplier/blacklist/{name}")
    boolean isInBlackList(@PathVariable String name);
}
