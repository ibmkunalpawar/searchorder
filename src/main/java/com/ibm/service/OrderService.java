package com.ibm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Order;
import com.ibm.repo.OrderRepository;

@Service

public class OrderService { //Spring Beans
	@Autowired
	OrderRepository orderRepository;
	public String createOrder(Order order) {
		Order savedOrder = orderRepository.save(order);
		return savedOrder.getId();
	}
	
	public List<Order> getOrders() {
		return orderRepository.findAll();
	}
	
	public void updateOrder(Order order) {
		orderRepository.save(order);
	
	}
	public void deleteOrder(String orderId) {
		orderRepository.deleteById(orderId);
	}
	public Optional<Order> getOrder(String orderId) {
		return orderRepository.findById(orderId);
	}
}