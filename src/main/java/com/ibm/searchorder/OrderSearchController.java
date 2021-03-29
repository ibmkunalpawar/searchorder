package com.ibm.searchorder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Order;
import com.ibm.service.OrderService;

@RestController
public class OrderSearchController {
	@Autowired // is used for DI
	OrderService orderService; // DI
	
	@GetMapping("/order")
	List<Order> getOrders(){
		return orderService.getOrders();
	}
	Optional<Order> getorderById(@PathVariable("id") String orderId ){
		return orderService.getOrder(orderId);
	}
		
}