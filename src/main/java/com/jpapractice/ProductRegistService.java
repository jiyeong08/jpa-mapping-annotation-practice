package com.jpapractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProductRegistService {
    private ProductRepository productRepository;

    @Autowired
    public ProductRegistService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Transactional
    public void registProduct(ProductRegistDTO productInfo){
        Product product = new Product(
                productInfo.getProductName(),
                productInfo.getManufacturer(),
                productInfo.getPrice(),
                productInfo.getReleaseDate(),
                productInfo.getScreenSize(),
                productInfo.getOperatingSys(),
                productInfo.getBattery()
        );
        productRepository.save(product);
    }
}
