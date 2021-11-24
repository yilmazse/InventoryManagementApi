package com.example.inventorymanagementapi.controller;

import com.example.inventorymanagementapi.model.Supply;
import com.example.inventorymanagementapi.repository.SupplierRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {
    private SupplierRepository supplierRepository;

    public SupplierController(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @GetMapping("")
    public List<Supply> index() {
        return supplierRepository.findAll();
    }
}
