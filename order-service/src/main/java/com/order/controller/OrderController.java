package com.order.controller;

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

import com.order.model.Orders;
import com.order.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	
	@Autowired
	OrderService orderService;

	@GetMapping("/getAllOrder")
	public List<Orders> getAllOrders(){
		
		return orderService.getAllOrders();
	}
	
	
	@PostMapping("/addOrder")
	public Orders addOrder(@RequestBody Orders order) {
		
		return orderService.addOrder(order);
	}
	
	
	
	@DeleteMapping("/deleteById/{customerId}")
	public String deleteOrder(@PathVariable int customerId ) {
		
		return orderService.deleteOrder(customerId);
	}
	
	@PutMapping("/updateOrderById/{customerId}")
	public String updateOrder(@RequestBody  Orders order ,@PathVariable  int customerId) {
		
		return orderService.updateOrder(order, customerId);
	}
	@GetMapping("/getById/{customerId}")
	public Optional<Orders> getOrderById(@PathVariable int customerId){
		return orderService.getOrderById(customerId);
	}
}
