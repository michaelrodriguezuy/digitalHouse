package repository;

import org.springframework.cloud.openfeign.FeignClient;
import model.dto.Product;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "products")
public interface FeignProductRepository {

  @RequestMapping(method = RequestMethod.GET, value = "/products")
  Product getProductById(@RequestParam String id);

}
