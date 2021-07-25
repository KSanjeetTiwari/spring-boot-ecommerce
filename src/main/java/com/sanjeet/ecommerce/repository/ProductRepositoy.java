package com.sanjeet.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sanjeet.ecommerce.entity.Product;

@CrossOrigin(origins="http://localhost:4200")
public interface ProductRepositoy extends JpaRepository<Product, Long>{

}
