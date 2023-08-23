package com.aria.springbootmall.dao;

import com.aria.springbootmall.dto.ProductRequest;
import com.aria.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
