package com.glorianyaga.Store.Repository;

import com.glorianyaga.Store.Modules.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
