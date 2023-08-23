package com.aria.springbootmall.service;

import com.aria.springbootmall.dto.ProductRequest;
import com.aria.springbootmall.model.Product;
import org.springframework.stereotype.Component;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
