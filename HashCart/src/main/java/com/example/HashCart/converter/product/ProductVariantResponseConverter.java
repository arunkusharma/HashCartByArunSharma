package com.example.HashCart.converter.product;

import com.example.HashCart.model.dto.ColorDTO;
import com.example.HashCart.model.dto.ProductVariantDTO;
import com.example.HashCart.model.entity.ProductVariant;
import com.example.HashCart.model.response.product.ProductVariantResponse;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ProductVariantResponseConverter implements Function<ProductVariant, ProductVariantResponse> {
    @Override
    public ProductVariantResponse apply(ProductVariant productVariant) {
        ProductVariantResponse productVariantResponse = new ProductVariantResponse();
        productVariantResponse.setId(productVariant.getId());
        productVariantResponse.setName(productVariant.getProduct().getName());
        productVariantResponse.setUrl(productVariant.getProduct().getUrl());
        productVariantResponse.setProductVariant(ProductVariantDTO
                .builder()
                .id(productVariant.getId())
                .price(productVariant.getPrice())
                .thumb(productVariant.getThumb())
                .stock(productVariant.getStock())
                .color(ColorDTO
                        .builder()
                        .name(productVariant.getColor().getName())
                        .hex(productVariant.getColor().getHex())
                        .build())
                .build()
        );

        return productVariantResponse;
    }
}
