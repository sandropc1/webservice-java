package com.sandropc1.webservicesjava.repositories;

import com.sandropc1.webservicesjava.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
