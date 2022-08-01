package com.example.HashCart.service.cache;


import com.example.HashCart.model.entity.ProductVariant;

import java.util.List;

public interface ProductVariantCacheService {

    ProductVariant findById(Long id);

    List<ProductVariant> findTop8ByOrderBySellCountDesc();
}
