package vn.toannvs.laptopshop.service;

import org.springframework.stereotype.Service;
import vn.toannvs.laptopshop.repository.UserRepository;
import vn.toannvs.laptopshop.domain.User;
import java.util.List;
import vn.toannvs.laptopshop.repository.RoleRepository;
import vn.toannvs.laptopshop.domain.Role;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
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
        System.out.println("Updated User: " + updatedUser);
        return updatedUser;
    }

    public User handleDeleteUser(long id) {
        User user = this.userRepository.findById(id);
        if (user != null) {
            this.userRepository.delete(user);
            return user;
        }
        return null; // or throw an exception if preferred
    }

    public Role getRoleByName(String name) {
        return this.roleRepository.findByName(name);
    }

}
