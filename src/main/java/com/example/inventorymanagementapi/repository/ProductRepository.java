package com.example.inventorymanagementapi.repository;

import com.example.inventorymanagementapi.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, String> {
}
