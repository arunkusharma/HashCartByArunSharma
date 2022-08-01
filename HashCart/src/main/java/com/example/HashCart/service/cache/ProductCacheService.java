package com.example.HashCart.service.cache;

import com.example.HashCart.model.entity.Product;
import com.example.HashCart.model.entity.ProductCategory;

import java.util.List;

public interface ProductCacheService {

    Product findByUrl(String url);

    List<Product> findTop8ByOrderByDateCreatedDesc();

    List<Product> getRelatedProducts(ProductCategory productCategory, Long id);

}
