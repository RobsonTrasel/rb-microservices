package com.robsondev.ms.productservice.repository;

import com.robsondev.ms.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
