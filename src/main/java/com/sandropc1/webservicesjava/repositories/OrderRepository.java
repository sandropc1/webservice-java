package com.sandropc1.webservicesjava.repositories;

import com.sandropc1.webservicesjava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
