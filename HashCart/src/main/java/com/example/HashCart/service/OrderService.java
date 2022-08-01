package com.example.HashCart.service;

import com.example.HashCart.model.request.order.PostOrderRequest;
import com.example.HashCart.model.response.order.OrderResponse;

import java.util.List;

public interface OrderService {
    Integer getAllOrdersCount();

    List<OrderResponse> getAllOrders(Integer page, Integer pageSize);

    OrderResponse postOrder(PostOrderRequest postOrderRequest);
}
