package com.example.HashCart.service;

import com.example.HashCart.dao.DiscountRepository;
import com.example.HashCart.error.exception.InvalidArgumentException;
import com.example.HashCart.error.exception.ResourceNotFoundException;
import com.example.HashCart.model.entity.Cart;
import com.example.HashCart.model.entity.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DiscountServiceImpl implements DiscountService {

    private final DiscountRepository discountRepository;
    private final CartService cartService;

    @Autowired
    public DiscountServiceImpl(DiscountRepository discountRepository, CartService cartService) {
        this.discountRepository = discountRepository;
        this.cartService = cartService;
    }

    @Override
    public void applyDiscount(String code) {
        Discount discount = discountRepository.findByCode(code)
                .orElseThrow(() -> new ResourceNotFoundException("Discount code not found"));

        if (discount.getStatus() != 1) {
            throw new InvalidArgumentException("Discount code is expired!");
        }

        Cart cart = cartService.getCart();

        cart.setDiscount(discount);
        cart = cartService.calculatePrice(cart);
        cartService.saveCart(cart);
    }
}
