package com.example.HashCart.service.cache;

import com.example.HashCart.model.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryCacheService {
    List<ProductCategory> findAllByOrderByName();
}
