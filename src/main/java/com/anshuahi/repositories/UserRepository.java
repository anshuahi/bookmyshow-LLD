package com.anshuahi.repositories;

import com.anshuahi.models.User;

public interface UserRepository {
    User findById(Long userId);
}
