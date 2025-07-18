package vn.toannvs.laptopshop.controller.admin;

import vn.toannvs.laptopshop.domain.User;
import vn.toannvs.laptopshop.repository.UserRepository;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.toannvs.laptopshop.service.UploadService;
import vn.toannvs.laptopshop.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.ServletContextAware;
import jakarta.servlet.ServletContext;
import java.io.File;

@Controller
public class UserController {

    private UserService userService;
    private final ServletContext servletContext;
    private final UploadService uploadService;
    private final PasswordEncoder passwordEncoder;

    public UserController(UserService userService, ServletContext servletContext, UploadService uploadService,
            PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.servletContext = servletContext;
        this.uploadService = uploadService;
        this.passwordEncoder = passwordEncoder;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        List<User> findUser = userService.getAllUsersByEmail("vitprofb@gmail.com");
        List<User> users = this.userService.getAllUSers();
        System.out.println("Find User: " + findUser);
        System.out.println("Users: " + users);
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        List<User> users = this.userService.getAllUSers();
        model.addAttribute("users", users);
        return "admin/user/user";
    }

    @GetMapping("/admin/user/create")
    public String createUser(Model model) {
        model.addAttribute("newUser", new User());
        List<User> users = this.userService.getAllUSers();
        model.addAttribute("users", users);
        return "admin/user/create";
    }

    @RequestMapping("/admin/user/update/{id}")
    public String getUpdateUserPage(@PathVariable("id") long id, Model model) {
        User user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        return "admin/user/update-user";
    }

    @PostMapping("/admin/user/update")
    public String postUpdateUser(Model model, @ModelAttribute("user") User user) {
        User existingUser = this.userService.getUserById(user.getId());
        System.out.println("Update User: " + user);
        if (existingUser != null) {
            existingUser.setEmail(user.getEmail());
            existingUser.setFullname(user.getFullname());
            this.userService.handleUpdateUser(existingUser);
        }

        return "redirect:/admin/user";
    }

    // Create new User

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String handleCreateUser(Model model,
            @ModelAttribute("newUser") User user,
            @RequestParam("hoidanitFile") MultipartFile file) {

        // Gọi service lưu user
        this.uploadService.handleSaveUploadFile(file, "avatar");

        this.userService.handleSaveUser(user);
        System.out.println("Created User: " + user);

        return "redirect:/admin/user";
    }

    @RequestMapping(value = "/admin/user/{id}", method = RequestMethod.GET)
    public String getUserDetailPage(@PathVariable("id") long id, Model model) {
        User user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        return "admin/user/user";
    }

    @GetMapping(value = "/admin/user/delete/{id}")
    public String getDeleteUser(@PathVariable("id") long id, Model model) {
        User user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        return "admin/user/delete";
    }

    @PostMapping(value = "/admin/user/delete")
    public String postDeleteUser(@RequestParam("id") long id, Model model) {
        User deletedUser = this.userService.handleDeleteUser(id);
        if (deletedUser != null) {
            System.out.println("Deleted User: " + deletedUser);
        } else {
            System.out.println("User not found for deletion with ID: " + id);
        }
        return "redirect:/admin/user";
    }

}
// @RestController()
// public class UserController {
// private UserService userService;

// public UserController(UserService userService) {
// this.userService = userService;
// }

// @GetMapping("/")
// public String getHomePage() {
// return userService.handleHello();
// }
// }
