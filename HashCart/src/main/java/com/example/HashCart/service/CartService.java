package com.example.HashCart.service;

import com.example.HashCart.model.entity.Cart;
import com.example.HashCart.model.request.cart.ConfirmCartRequest;
import com.example.HashCart.model.response.cart.CartResponse;


public interface CartService {
    CartResponse addToCart(Long id, Integer amount);

    CartResponse incrementCartItem(Long cartItemId, Integer amount);

    CartResponse decrementCartItem(Long cartItemId, Integer amount);

    CartResponse fetchCart();

    CartResponse removeFromCart(Long id);

    boolean confirmCart(ConfirmCartRequest confirmCartRequest);

    Cart getCart();

    void saveCart(Cart cart);

    void emptyCart();

    Cart calculatePrice(Cart cart);

}
