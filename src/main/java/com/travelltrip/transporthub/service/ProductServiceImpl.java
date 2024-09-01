package com.travelltrip.transporthub.service;


import com.travelltrip.transporthub.exception.CustomNotFoundException;
import com.travelltrip.transporthub.model.Product;
import com.travelltrip.transporthub.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
   @Autowired
    private ProductRepository repository;

   @Override
    public Product addProductService(Product product) {
       return repository.save(product);
    }

    @Override
    public Product getProductService(Long productId) throws CustomNotFoundException {
        Optional<Product> getProduct= repository.findById(productId);
        if(getProduct.isEmpty()){
            throw new CustomNotFoundException("product not found");
        }
        return getProduct.get();
    }

    @Override
    public List<Product> getAllProductService() {
        List<Product> list =new ArrayList<>(repository.findAll());
        return list;
    }

    @Override
    public Product updateProductService(Long productId,Product product) {
        Optional<Product> getProduct= repository.findById(productId);
        if(getProduct.isEmpty()){
            throw new CustomNotFoundException("product not exist");
        }
       return repository.save(product);
    }

    @Override
    public void deleteProductService(Long productId) {
        Optional<Product> getProduct= repository.findById(productId);
        if(getProduct.isEmpty()){
            throw new CustomNotFoundException("product not exist");
        }
        repository.deleteById(productId);
    }
    @Override
    public void deleteAllProductService() {
       repository.deleteAll();
    }
}
