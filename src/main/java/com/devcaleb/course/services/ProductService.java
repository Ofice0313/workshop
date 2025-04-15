package com.devcaleb.course.services;

import com.devcaleb.course.entities.Product;
import com.devcaleb.course.entities.User;
import com.devcaleb.course.repositories.ProductRepository;
import com.devcaleb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
