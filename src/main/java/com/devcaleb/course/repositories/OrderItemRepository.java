package com.devcaleb.course.repositories;

import com.devcaleb.course.entities.OrderItem;
import com.devcaleb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
