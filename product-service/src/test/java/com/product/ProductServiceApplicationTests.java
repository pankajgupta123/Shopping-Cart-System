package com.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

//import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;

//import javax.swing.Spring;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.product.exception.EmptyInputException;
import com.product.model.Product;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductServiceApplicationTests {

	 
     
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
	@Test
	public void addProduct() throws EmptyInputException
	{
		Product product = new Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium");
		when(proRepository.save(product)).thenReturn(product);
		assertEquals(product,proService.addProduct(product));
	}
	
	/*
	 * @Test public void deleteByProductId() throws EmptyInputException { Product
	 * product = new Product(5,"Clock","Titan","abcd","cat.jpg",4000,5,"good");
	 * proService.deleteByProductId(product, 5);
	 * verify(proRepository,times(1)).delete(product); }
	 * 
	 * @Test public void updateProduct() throws EmptyInputException { Product
	 * product = proRepository.findById(1).get(); product.setProductName("Ship");
	 * Product productUpdated = proRepository.save(product);
	 * Assertions.assertThat(productUpdated.getProductName()).isEqualTo("Jeep"); }
	 * 
	 * @Test public void deleteByProductIdTest() throws EmptyInputException {
	 * Product product = proRepository.findById(1).get();
	 * product.setProductName("Ship"); Product productUpdated =
	 * proRepository.save(product);
	 * Assertions.assertThat(productUpdated.getProductName()).isEqualTo("Jeep"); }
	 */
	
	
	/*
	 * @Test public void getProductByIdTest() { int productId = 2;
	 * when(proRepository.findById(productId)).thenReturn(Optional.of(Stream.of (new
	 * Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium"),new
	 * Product(6,"Laptop","HP","abcd","pic.jpg",5000,4,"medium"))
	 * .collect(Collectors.toList()))); }
	 */
	
	
	
	
	
	/*
	 * @Test public void addProductTest() { Product pd =new Product();
	 * pd.setProductId(2); pd.setProductType("Mobile"); pd.setProductName("Realme");
	 * pd.setCategory("abcd"); pd.setImage("pic.jpg"); pd.setPrice(null);
	 * pd.setRating(4); pd.setDescription("Medium"); proRepository.save(pd);
	 * assertNotNull(proRepository.findById(2).get()); }
	 */
	 
	
	
	
	
	
	
	
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
	
				/*
				 * @Test public void deleteByProductIdTest() { Product product=new
				 * Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium");
				 * proService.deleteByProductId(product,2);
				 * verify(proRepository,times(1)).delete(product); }
				 * 
				 * @Test public void updateByProductIdTest() { Product product = new
				 * Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium");
				 * proService.updateProduct(product, 2); verify(proRepository,times(1)); }
				 */
	
	 
	}
	
	

