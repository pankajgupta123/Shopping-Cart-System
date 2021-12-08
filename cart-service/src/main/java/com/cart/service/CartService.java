package com.cart.service;

import java.util.List;
import java.util.Optional;

import com.cart.model.Cart;

public interface CartService {

	public Cart addCart( Cart cart);
	public Optional<Cart> getCartById(int cartId);
	public String updateCartDetails( Cart cart,  int cartId);
	public List<Cart> getAllCarts();
	public String deleteCartDetails(int cartId);
	 
	 
}
