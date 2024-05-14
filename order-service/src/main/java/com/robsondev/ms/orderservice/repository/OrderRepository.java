package com.robsondev.ms.orderservice.repository;

import com.robsondev.ms.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
