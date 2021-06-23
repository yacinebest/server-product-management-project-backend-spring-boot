package com.besttocode.serverproductmanagement.service;


import com.besttocode.serverproductmanagement.model.Product;
import com.besttocode.serverproductmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
//It is not necessary. You can use it, if you have multiple database operation in a single service method.
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(final Product product){
        productRepository.save(product);
        return product;
    }

    @Override
    public Product updateProduct(final Product product){
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(final Long productId){
        productRepository.deleteById(productId);
    }

    @Override
    public Long numberOfProducts(){
        return productRepository.count();
    }

    @Override
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }
}
