package com.travelltrip.transporthub.controller;

import com.travelltrip.transporthub.model.Product;
import com.travelltrip.transporthub.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return new ResponseEntity<>(service.addProductService(product),HttpStatus.CREATED);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable("productId") Long productId){
        return new ResponseEntity<>(service.getProductService(productId),HttpStatus.OK) ;
    }
    @GetMapping("/product")
    public ResponseEntity<?> getAllProduct() {
            return new ResponseEntity<>(service.getAllProductService(),HttpStatus.OK) ;
    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long productId,@RequestBody Product product){
        return new ResponseEntity<>(service.updateProductService(productId,product),HttpStatus.OK);
    }
    @DeleteMapping("/product/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable("productId") Long productId){
        service.deleteProductService(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/product")
    public ResponseEntity<?> deleteAllProduct(){
        service.deleteAllProductService();
        return new ResponseEntity<>(,HttpStatus.OK);
    }
}
