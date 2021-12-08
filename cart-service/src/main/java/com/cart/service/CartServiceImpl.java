package com.cart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cart.exception.ItemException;
import com.cart.model.Cart;
import com.cart.repository.CartRepository;

public class CartServiceImpl implements CartService{
	
	@Autowired
	CartRepository cartRepo;
	@Override
	public Cart addCart( Cart cart) {
		if(cart.getItems().isEmpty()) {
			throw new ItemException("801","provide the details of cart");
		}
		Cart c = cartRepo.save(cart);
		return c;
	}
	
	//find all cartDetails
		@Override
		public List<Cart> getAllCarts(){
			List<Cart> cartList = cartRepo.findAll();
			if(cartList.isEmpty()) {
				throw new ItemException("802","Cart is completely empty");
			}
			else {
				return cartRepo.findAll();
			}
			
		}
		
	
	//find the Cart by id
	@Override
	public Optional<Cart> getCartById(int cartId){
		Optional<Cart> findById= cartRepo.findById(cartId);
		if(findById.isEmpty()) {
			throw new ItemException("803","Cart not found with any Id");
		}else {
			return cartRepo.findById(cartId);
		}
	}
	
	//update the Cart by id
	@Override
	public String updateCartDetails( Cart cart, int cartId) {
		boolean isCropExist = cartRepo.existsById(cartId);
		if(isCropExist) {
			cartRepo.save(cart);
			return "Update Cartdetails with id: "+cartId;
		}else {
			throw new ItemException("805","can not update cart with Id");
		}
		
		
	}
	
	//delete by id
	@Override 
	public String deleteCartDetails(int  cartId) {
		boolean isCropExist = cartRepo.existsById(cartId);
		if(isCropExist) {
			cartRepo.deleteById(cartId);
			 return "Delete Cartdetails with id: "+cartId;
		}else {
			throw new ItemException("806","Can not delete cart by Id");
		}
		
	}
	
	 

}
