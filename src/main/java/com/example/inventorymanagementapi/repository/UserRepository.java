package com.example.inventorymanagementapi.repository;

import com.example.inventorymanagementapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
