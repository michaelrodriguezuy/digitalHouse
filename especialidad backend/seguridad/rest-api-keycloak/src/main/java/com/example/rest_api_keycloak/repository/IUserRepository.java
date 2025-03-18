package com.example.rest_api_keycloak.repository;

import com.example.rest_api_keycloak.model.User;

import java.util.List;
import java.util.Optional;

public abstract class IUserRepository {
    public abstract Optional<User> findById(String id);

    public abstract List<User> findByUsername(String username);
}
