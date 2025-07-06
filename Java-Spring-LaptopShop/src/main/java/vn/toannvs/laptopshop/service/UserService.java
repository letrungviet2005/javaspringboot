package vn.toannvs.laptopshop.service;

import org.springframework.stereotype.Service;
import vn.toannvs.laptopshop.repository.UserRepository;
import vn.toannvs.laptopshop.domain.User;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String handleHello() {
        return "Hello from UserService";
    }

    public User handleSaveUser(User user) {
        // Logic to save the user

        User eric = this.userRepository.save(user);
        return eric;

    }

    public List<User> getAllUSers() {
        return this.userRepository.findAll();
    }

    public User getUserById(long id) {
        return this.userRepository.findById(id);
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findAll();
    }

    public User handleUpdateUser(User user) {
        // Logic to update the user
        User updatedUser = this.userRepository.save(user);
        return updatedUser;
    }

}
