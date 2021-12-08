package com.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductService;
//import com.product.service.ProductServiceImpl;

@RestController
@RequestMapping("/api/product")
public class ProductResource {

	@Autowired
	ProductService proService;
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProducts() {
		return proService.getAllProducts();
	}
	@GetMapping("/getProductById/{productId}")
	public Optional<Product> getProductById(@PathVariable int productId){
		
		return proService.getProductById(productId);
	}
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		
		return proService.addProduct(product);
	}
	
	@PutMapping("/updateProduct/{productId}")
	public String updateProduct(@RequestBody Product product,@PathVariable int productId ) {
		return proService.updateProduct(product, productId);
	}
	
	
	@DeleteMapping("/deleteProductById/{productId}")
	public String deleteByProductId(@RequestBody Product product,@PathVariable ("productId") int productId) {
		
		return proService.deleteByProductId(product, productId);
	}
	
		
}
	


