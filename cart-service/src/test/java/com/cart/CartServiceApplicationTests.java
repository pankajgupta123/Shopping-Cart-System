package com.cart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cart.exception.ItemException;
import com.cart.model.Cart;
import com.cart.model.Items;
import com.cart.repository.CartRepository;
import com.cart.service.CartService;
//import com.product.exception.EmptyInputException;
//import com.product.model.Product;
//import com.product.model.Product;
@RunWith(SpringRunner.class)
@SpringBootTest
class CartServiceApplicationTests {
	@Autowired
	private CartService cartService;
	
	@MockBean
	private CartRepository cartRepo;

	@Test
	 public void getAllCartTest()
	 {
		when(cartRepo.findAll()).thenReturn(Stream.of
				(new Cart(2,1000.0,"clothe",20000.0,3),new Cart(2,1000.0,"Watch",10000.0,3))
				.collect(Collectors.toList()));
		assertEquals(2,cartService.getAllCarts().size());
	 }

		/*
		 * @Test public void addCart() throws ItemException {
		 * 
		 * Cart cart = new Cart(2,100.556,"Clothe",20.564,3);
		 * when(cartRepo.save(cart)).thenReturn(cart);
		 * assertEquals(cart,cartService.addCart(cart));
		 * 
		 * }
		 */
	@Test
	public void addCartTest() throws ItemException
	{
	Cart cart = new Cart(2,1000.0,Arrays.asList(new Items("Banana",100.0,3)));
	when(cartRepo.save(cart)).thenReturn(cart);
	assertEquals(cart,cartService.addCart(cart));

	}	
	
	
	@Test
	public void deleteByCartId() throws ItemException
	{
		Cart cart = new Cart(2,1000.0,Arrays.asList(new Items("Banana",100.0,3)));
		cartService.deleteCartDetails(5);
		verify(cartRepo,times(1)).delete(cart);
	}
	

}
