package repository;

import model.User;

import java.util.List;
import java.util.Optional;

public abstract class IUserRepository {
    public abstract Optional<User> findById(String id);

    public abstract List<User> findByUsername(String username);
}
