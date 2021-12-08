package com.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.exception.EmptyInputException;
import com.order.model.Orders;
import com.order.repository.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepo;
	

	//Add order
	@Override
	public Orders addOrder(Orders order) {
		if(order.getOrderStatus().isEmpty()||order.getOrderStatus().length()==0)
		{
			throw new EmptyInputException("310","product is not added");
		}
		else
		{
			return  orderRepo.save(order);
		}
	       }
	
	
	
	//Get All orders
	@Override
	public List<Orders> getAllOrders() {
	        List<Orders> allOrders = orderRepo.findAll();
	        if(allOrders.isEmpty())
	        {
	        	throw new EmptyInputException("201"," product is not available");
	        }
	        else
	        {
	        	return  allOrders;
	        }
           }
	
	
	
	//Get order by id
	@Override
	public Optional<Orders> getOrderById(int customerId) {
	          Optional<Orders> findOrderById= orderRepo.findById(customerId);
	          if(findOrderById.isEmpty())
	          {
	        	  throw new EmptyInputException("301","order cannot be placed by this id");
	          }
	          else
	          {
	        	  return findOrderById;
	          }
	                 
	             }

	
	//delete id by id
	@Override
	public String deleteOrder(int customerId) {
	     boolean isOrderExist = orderRepo.existsById(customerId);
	     if(isOrderExist)
	     {
	    	 orderRepo.deleteById(customerId);
	    	 return "order is deleted by id"+customerId;
	     }
	     else
	     {
	    	 throw new EmptyInputException("550","order is not deleted");
	     }
	     } 
	            

	
	//update data with id

	
	@Override
	public String updateOrder(Orders order, int customerId) {
		 boolean isOrderExist = orderRepo.existsById(customerId);
		 if(isOrderExist)
	     {
	    	orderRepo.save(order);
	    	return "order updated by id"+customerId;
	     }
	     else
	     {
	    	 throw new EmptyInputException("420","order is not updated by Id");
	     }
	        
	      }
}
