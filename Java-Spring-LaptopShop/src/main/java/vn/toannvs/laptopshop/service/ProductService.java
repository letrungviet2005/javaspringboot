package vn.toannvs.laptopshop.service;

import org.springframework.stereotype.Service;
import vn.toannvs.laptopshop.repository.ProductRepository;
import vn.toannvs.laptopshop.domain.Product;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Long id) {
        return this.productRepository.findById(id).orElse(null);
    }

}
