package com.product.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.product.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,Integer>
{

	Optional<Product> findByProductName(String productName);
 
}
