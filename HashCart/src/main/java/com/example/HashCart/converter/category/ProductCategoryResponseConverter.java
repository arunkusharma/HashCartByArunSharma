package com.example.HashCart.converter.category;

import com.example.HashCart.model.dto.CategoryDTO;
import com.example.HashCart.model.entity.ProductCategory;
import com.example.HashCart.model.response.category.ProductCategoryResponse;
import org.springframework.stereotype.Component;

import java.util.function.Function;


@Component
public class ProductCategoryResponseConverter implements Function<ProductCategory, ProductCategoryResponse> {
    @Override
    public ProductCategoryResponse apply(ProductCategory productCategory) {
        ProductCategoryResponse productCategoryResponse = new ProductCategoryResponse();
        productCategoryResponse.setCategory(CategoryDTO.builder().name(productCategory.getName()).build());
        return productCategoryResponse;
    }
}
