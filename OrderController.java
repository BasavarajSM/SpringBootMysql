package com.mindtree.mysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Order> getOrders()
	{
		List<Order> orders = (List<Order>) orderRepository.findAll();
		System.out.println(orders.size() + "............................");
		return orders;
	}

}
