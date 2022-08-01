package com.example.HashCart.service;


import com.example.HashCart.model.entity.User;
import com.example.HashCart.model.request.user.PasswordResetRequest;
import com.example.HashCart.model.request.user.RegisterUserRequest;
import com.example.HashCart.model.request.user.UpdateUserAddressRequest;
import com.example.HashCart.model.request.user.UpdateUserRequest;
import com.example.HashCart.model.response.user.UserResponse;

public interface UserService {
    User register(RegisterUserRequest registerUserRequest);

    UserResponse fetchUser();

    User getUser();

    User saveUser(User user);

    User findByEmail(String email);

    boolean userExists(String email);

    UserResponse updateUser(UpdateUserRequest updateUserRequest);

    UserResponse updateUserAddress(UpdateUserAddressRequest updateUserAddressRequest);

    void resetPassword(PasswordResetRequest passwordResetRequest);

    Boolean getVerificationStatus();
}
