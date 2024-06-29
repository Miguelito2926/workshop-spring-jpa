package com.educajava.curso.resource;

import com.educajava.curso.entities.Product;
import com.educajava.curso.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = productService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product product = productService.findById(id);
        return ResponseEntity.ok().body(product);
    }
   HttpStatus status = HttpStatus.CREATED;
    @PostMapping
    public ResponseEntity<Product> insertProduct(@RequestBody Product product){
        product = productService.insertProduct(product);
        return ResponseEntity.status(status).body(product);
    }
}
