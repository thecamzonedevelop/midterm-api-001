package com.example.midtermapi001.repository;

import com.example.midtermapi001.models.Product;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
}
