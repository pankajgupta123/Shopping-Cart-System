package com.order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.order.exception.EmptyInputException;
import com.order.model.Address;
//import com.cart.model.Cart;
//import com.cart.model.Cart;
import com.order.model.Orders;
import com.order.model.Product;
import com.order.repository.OrderRepository;
import com.order.service.OrderService;
@RunWith(SpringRunner.class)
@SpringBootTest
class OrderServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private OrderService orderService;
	
	@MockBean
	private OrderRepository orderRepo;
	@Test
	public void getAllOrdersTest()
	{
		when(orderRepo.findAll()).thenReturn(Stream.of
				(new Orders(1,"2021-07-25",123,234.222212,"Paytm","Paid",2,1,"Clothe",123,"pankaj",345678,23,"varanasi","UP",2334411)
						,new Orders(1,"2021-07-25",123,234.222212,"Paytm","Paid",2,1,"Clothe",123,"pankaj",345678,23,"varanasi","UP",2334411))
				.collect(Collectors.toList()));
		assertEquals(2,orderService.getAllOrders().size());
	}
	/*
	 * @Test public void addOrderTest() throws EmptyInputException { Orders order =
	 * new
	 * Orders(1,"2021-07-25",123,234.222212,"Paytm","Paid",2,1,"Clothe",123,"pankaj"
	 * ,345678,23,"varanasi","UP",2334411);
	 * when(orderRepo.save(order)).thenReturn(order);
	 * assertEquals(order,orderService.addOrder(order)); }
	 */
	@Test
	public void addOrderTest() throws EmptyInputException
	{
	Orders order = new Orders(1,2021-12-12,10,200.98,"Paytm","paid",3,Arrays.asList(new Product(1,"grocery")),
			Arrays.asList(new Address(10,"Pankaj","1234576","12","Varanasi","UP","1233456")));
	when(orderRepo.save(order)).thenReturn(order);
	assertEquals(order,orderService.addOrder(order));
	 
	}
	 

}
