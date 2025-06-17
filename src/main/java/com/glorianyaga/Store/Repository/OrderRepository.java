package com.glorianyaga.Store.Repository;

import com.glorianyaga.Store.Modules.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
