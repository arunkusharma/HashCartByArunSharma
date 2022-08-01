package com.example.HashCart.service;

import com.example.HashCart.model.response.category.ProductCategoryResponse;

import java.util.List;

public interface ProductCategoryService {
    List<ProductCategoryResponse> findAllByOrderByName();
}
