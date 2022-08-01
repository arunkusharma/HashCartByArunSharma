package com.example.HashCart.model.response.product;

import com.example.HashCart.model.dto.ProductVariantDTO;
import lombok.Data;

import java.util.List;

@Data
public class ProductResponse {
    private String name;
    private String url;
    private List<ProductVariantDTO> productVariants;
}