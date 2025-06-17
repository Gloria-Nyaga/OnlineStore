package com.glorianyaga.Store.Service;

import com.glorianyaga.Store.Modules.Productline;
import org.springframework.stereotype.Service;

@Service
public interface ProductlineServiceI {
    Productline createProductline(Productline productline);
    Productline getProductline(Long productLine);
    Productline updateProductline(Long productLine, Productline productline);
    void deleteProductline(Long productLine);
}
