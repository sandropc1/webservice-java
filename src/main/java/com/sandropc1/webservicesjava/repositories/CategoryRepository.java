package com.sandropc1.webservicesjava.repositories;

import com.sandropc1.webservicesjava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
