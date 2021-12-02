package com.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.product.model.Product;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;

@SpringBootTest
class ProductServiceApplicationTests {

	@Test
	void contextLoads() {
	}
     
	@Autowired
	private ProductService proService;
	
	@MockBean
	private ProductRepository proRepository;
	@Test
	public void getAllProductTest()
	{
		when(proRepository.findAll()).thenReturn(Stream.of
				(new Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium"),new Product(6,"Laptop","HP","abcd","pic.jpg",5000,4,"medium"))
				.collect(Collectors.toList()));
		assertEquals(2,proService.getAllProducts().size());
				}
				/*
				 * @Test public void getProductBynameTest() { String productName ="Realme";
				 * when(proRepository.findByProductName(productName)).thenReturn(Stream.of( new
				 * Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium")).
				 * collect(Collectors.toList())); }
				 */	/*
	 * public void getProductByCategoryTest() { String category ="abcd";
	 * when(proRepository.findByProductName(category)).thenReturn(Stream.of( new
	 * Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium")).
	 * collect(Collectors.toList())); }
	 * 
	 * public void getProductByTypeTest() { String type="Mobile";
	 * when(proRepository.findByProductName(type)).thenReturn(Stream.of( new
	 * Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium")).
	 * collect(Collectors.toList())); }
	 */	
	
	 
	}
	
	

