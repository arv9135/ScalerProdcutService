package com.scaler.productservicemorningbatch.controllers;

import com.scaler.productservicemorningbatch.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id){
        Product product = new Product();
        return product;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return new ArrayList<Product>();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return product;
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody Product product){
        return product;
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable long id, @RequestBody Product product){
        return product;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id){

    }
}
