package com.devcaleb.course.repositories;

import com.devcaleb.course.entities.Category;
import com.devcaleb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
