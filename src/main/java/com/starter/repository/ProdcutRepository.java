package com.starter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.starter.document.Product;

public interface ProdcutRepository extends MongoRepository<Product, String> {

}
