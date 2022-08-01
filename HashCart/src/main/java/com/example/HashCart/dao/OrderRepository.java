package com.example.HashCart.dao;

import com.example.HashCart.model.entity.Order;
import com.example.HashCart.model.entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
    List<Order> findAllByUserOrderByDateDesc(User user, Pageable pageable);

    Optional<Integer> countAllByUser(User user);
}
