package com.aria.springbootmall.service;

import com.aria.springbootmall.model.Product;
import org.springframework.stereotype.Component;

public interface ProductService {

    Product getProductById(Integer productId);
}
