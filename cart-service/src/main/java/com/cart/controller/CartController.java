package com.cart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.model.Cart;
import com.cart.service.CartService;

@RestController
@RequestMapping("/api/cartsystem")
public class CartController {

	
	@Autowired
	// loose coupling
	CartService cartService;
	
	
	
	@PostMapping("/addItemToCart")
	public Cart addCart(@RequestBody Cart cart) {
		return cartService.addCart(cart);
	}
	
	@GetMapping("/getAllItem")
	public List<Cart> getAllCarts() {
		return cartService.getAllCarts();
	}
	@GetMapping("/getItemById/{cartId}")
	public Optional<Cart> getCartById(@PathVariable("cartId") int cartId){
		return cartService.getCartById(cartId);
		
		
	}
	@DeleteMapping("/deleteItem/{cartId}")
	public String deleteCartDetails( @PathVariable("cartId") int cartId) 
	{
		return cartService.deleteCartDetails(cartId);
		
	}
	@PutMapping("/updateItem/{cartId}")
	public String updateCartDetails(@RequestBody Cart cart, @PathVariable("cartId") int cartId) {
		cartService.updateCartDetails(cart, cartId);
		return "update item with product name" +  cartId;
	}
}
