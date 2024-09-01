package com.travelltrip.transporthub.service;

import com.travelltrip.transporthub.model.Product;
import java.util.List;


public interface ProductService {
    Product addProductService(Product product);
    Product getProductService(Long productId);
    List<Product> getAllProductService();
    Product updateProductService(Long productId,Product product);
    void deleteProductService(Long productId);
    void deleteAllProductService();
}