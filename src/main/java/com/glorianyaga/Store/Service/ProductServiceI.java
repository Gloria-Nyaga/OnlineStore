package com.glorianyaga.Store.Service;

import com.glorianyaga.Store.Modules.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductServiceI {
    Product createProduct(Product product);
    Product getProduct(Long productCode);
    Product updateProduct(Long productCode, Product product);
    void deleteProduct(Long productCode);
}
