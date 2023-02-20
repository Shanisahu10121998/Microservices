package com.Product.Contoller;

import com.Product.Models.Product;
import com.Product.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Products")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping(path = "/add",consumes = "application/json")
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }
    @GetMapping(path = "/get/{id}",consumes = "application/json")
    public Optional<Product> searchById(@PathVariable Integer id){
        return productService.searchById(id);
    }
    @GetMapping(path = "/list",consumes = "application/json")
    public List<Product> list(){
        return productService.getAllProductsList();
    }
    @DeleteMapping(path = "/remove",consumes = "application/json")
    public String deleteById(@RequestParam("id") Integer id){
        return productService.deleteById(id);
    }
}