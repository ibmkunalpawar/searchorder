package com.ibm.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.entity.Order;

public interface OrderRepository extends MongoRepository<Order , String> {

}
