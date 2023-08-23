package com.aria.springbootmall.rowmapper;

import com.aria.springbootmall.constant.ProductCategory;
import com.aria.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();

        product.setProductId(resultSet.getInt("product_id"));
        product.setProductName(resultSet.getString("product_name"));

        // String 轉 Enum 寫法
        // 寫一 categoryStr 的 String 出來，接住 resultSet 中取出的資料庫的值
        String categoryStr = resultSet.getString("category");

        // 將字串轉換成 Enum 類型
        // 根據傳進去的字串的值，找尋對應中的 ProductCategory 中的固定值，存放在 category 的變數中
        ProductCategory category = ProductCategory.valueOf(categoryStr);

        // 將 category 變數傳入 product 的 set 方法內
        product.setCategory(category);

        /* 可將上方程式改寫為一行：
        *  product.setCategory(ProductCategory.valueOf(resultSet.getString("category")));
        *  直接將資料庫中取出來的字串，轉換成 category 的 Enum 值，傳入到 set 方法內做設定*/


        product.setImageUrl(resultSet.getString("image_url"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        product.setDescription(resultSet.getString("category"));
        product.setCreatedDate(resultSet.getDate("created_date"));
        product.setLastModifiedDate(resultSet.getDate("last_modified_date"));

        return product;
    }
}
