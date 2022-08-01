package com.example.HashCart.model.response.product;

import com.example.HashCart.model.dto.CategoryDTO;
import com.example.HashCart.model.dto.ProductVariantDetailDTO;
import lombok.Data;

import java.util.List;

@Data
public class ProductDetailsResponse {
    private String name;
    private String url;
    private String sku;
    private String longDesc;
    private CategoryDTO category;
    private List<ProductVariantDetailDTO> productVariantDetails;
}