package service.implementation;

import org.springframework.stereotype.Service;

import model.dto.Product;
import repository.FeignProductRepository;
import service.IProductService;

@Service
public class ProductService implements IProductService {

    private FeignProductRepository feignProductRepository;

    public ProductService(FeignProductRepository feignProductRepository) {
        super();
        this.feignProductRepository = feignProductRepository;
    }

    @Override
    public Product getProduct(String id) {
        return feignProductRepository.getProductById(id);
    }

}
