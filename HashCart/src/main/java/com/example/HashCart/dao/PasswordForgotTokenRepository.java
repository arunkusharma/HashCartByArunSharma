package com.example.HashCart.dao;

import com.example.HashCart.model.entity.PasswordForgotToken;
import com.example.HashCart.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PasswordForgotTokenRepository extends CrudRepository<PasswordForgotToken, Long> {
    Optional<PasswordForgotToken> findByToken(String token);

    Optional<PasswordForgotToken> findByUser(User user);
}
