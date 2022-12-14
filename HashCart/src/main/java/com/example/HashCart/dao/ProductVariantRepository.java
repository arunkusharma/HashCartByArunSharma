package com.example.HashCart.dao;

import com.example.HashCart.model.entity.ProductVariant;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductVariantRepository extends PagingAndSortingRepository<ProductVariant, Long>,
        JpaSpecificationExecutor<ProductVariant> {
    List<ProductVariant> findTop8ByOrderBySellCountDesc();
}
