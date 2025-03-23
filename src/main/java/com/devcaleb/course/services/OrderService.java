package com.devcaleb.course.services;

import com.devcaleb.course.entities.Order;
import com.devcaleb.course.entities.User;
import com.devcaleb.course.repositories.OrderRepository;
import com.devcaleb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
