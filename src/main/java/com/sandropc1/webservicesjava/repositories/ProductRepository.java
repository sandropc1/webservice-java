package com.sandropc1.webservicesjava.repositories;

import com.sandropc1.webservicesjava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
