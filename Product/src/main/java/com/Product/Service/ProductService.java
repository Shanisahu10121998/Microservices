package com.Product.Service;

import com.Product.Models.Product;
import com.Product.Repo.ProductRepository;
import com.sun.net.httpserver.Authenticator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @CacheEvict(value = "products",allEntries = true)
    public Product create(Product product){
        System.out.println("create method invoked");
        return productRepository.save(product);
    }
    public Optional<Product> searchById(Integer id){
        return productRepository.findById(id);
    }
    @Cacheable("products")
    public List<Product> getAllProductsList(){
        System.out.println("getAllProductsList method invoked");
        return productRepository.findAll();
    }
    public String deleteById(Integer id){
        productRepository.deleteById(id);
        return "Success";
    }
}
