package com.aria.springbootmall.service.impl;

import com.aria.springbootmall.dao.ProductDao;
import com.aria.springbootmall.model.Product;
import com.aria.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
