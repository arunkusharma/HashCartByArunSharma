package com.example.HashCart.service;

import com.example.HashCart.converter.category.ProductCategoryResponseConverter;
import com.example.HashCart.error.exception.ResourceNotFoundException;
import com.example.HashCart.model.entity.ProductCategory;
import com.example.HashCart.model.response.category.ProductCategoryResponse;
import com.example.HashCart.service.cache.ProductCategoryCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final ProductCategoryCacheService productCategoryCacheService;
    private final ProductCategoryResponseConverter productCategoryResponseConverter;

    @Autowired
    public ProductCategoryServiceImpl(ProductCategoryCacheService productCategoryCacheService,
                                      ProductCategoryResponseConverter productCategoryResponseConverter) {
        this.productCategoryCacheService = productCategoryCacheService;
        this.productCategoryResponseConverter = productCategoryResponseConverter;
    }


    @Override
    public List<ProductCategoryResponse> findAllByOrderByName() {
        List<ProductCategory> productCategories = productCategoryCacheService.findAllByOrderByName();
        if (productCategories.isEmpty()) {
            throw new ResourceNotFoundException("Could not find product categories");
        }
        return productCategories
                .stream()
                .map(productCategoryResponseConverter)
                .collect(Collectors.toList());
    }
}
