package com.example.inventorymanagementapi.repository;

import com.example.inventorymanagementapi.model.Supply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supply, String> {
}
