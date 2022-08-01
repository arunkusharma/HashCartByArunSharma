package com.example.HashCart.model.response.cart;

import com.example.HashCart.model.dto.CartItemDTO;
import com.example.HashCart.model.dto.DiscountDTO;
import lombok.Data;

import java.util.List;

@Data
public class CartResponse {
    private List<CartItemDTO> cartItems;
    private DiscountDTO discount;
    private Float totalCartPrice;
    private Float totalCargoPrice;
    private Float totalPrice;
}
