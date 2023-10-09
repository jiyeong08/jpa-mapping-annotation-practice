package com.jpapractice;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ProductRepository {

    @PersistenceContext
    private EntityManager manager;

    public void save(Product product){
        manager.persist(product);
    }
}
