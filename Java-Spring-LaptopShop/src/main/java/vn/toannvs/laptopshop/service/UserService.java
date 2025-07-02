package vn.toannvs.laptopshop.service;

import org.springframework.stereotype.Service;
import vn.toannvs.laptopshop.repository.UserRepository;
import vn.toannvs.laptopshop.domain.User;

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

}
