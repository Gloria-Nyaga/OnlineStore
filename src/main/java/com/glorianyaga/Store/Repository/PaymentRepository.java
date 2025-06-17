package com.glorianyaga.Store.Repository;

import com.glorianyaga.Store.Modules.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
