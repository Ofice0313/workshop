package com.devcaleb.course.services;

import com.devcaleb.course.entities.Category;
import com.devcaleb.course.entities.User;
import com.devcaleb.course.repositories.CategoryRepository;
import com.devcaleb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
