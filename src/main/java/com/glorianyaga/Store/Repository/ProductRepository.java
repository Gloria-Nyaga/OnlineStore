package com.glorianyaga.Store.Repository;

import com.glorianyaga.Store.Modules.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
