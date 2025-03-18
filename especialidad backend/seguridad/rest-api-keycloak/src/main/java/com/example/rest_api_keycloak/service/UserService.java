package service;

import model.User;
import org.springframework.stereotype.Service;
import repository.IUserRepository;

import java.util.List;

@Service
public class UserService {
    private IUserRepository userRepository;

    public UserService (IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User findById (String id){
        return userRepository.findById(id).orElse(null);
    }

    public List<User> findByUsername (String username){
        return userRepository.findByUsername(username);
    }
}
