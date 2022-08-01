package com.example.HashCart.service;

import com.example.HashCart.model.entity.User;
import com.example.HashCart.model.request.user.PasswordForgotValidateRequest;


public interface TokenService {

    void createEmailConfirmToken(User user);

    void createPasswordResetToken(String email);

    void validateEmail(String token);

    void validateForgotPasswordConfirm(String token);

    void validateForgotPassword(PasswordForgotValidateRequest passwordForgotValidateRequest);
}
