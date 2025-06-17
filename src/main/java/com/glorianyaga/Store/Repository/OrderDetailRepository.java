package com.glorianyaga.Store.Repository;

import com.glorianyaga.Store.Modules.OrderDetail;
import com.glorianyaga.Store.Modules.OrderDetailId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
}
