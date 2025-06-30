package vn.toannvs.laptopshop.controller;

import vn.toannvs.laptopshop.domain.User;
import vn.toannvs.laptopshop.repository.UserRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.toannvs.laptopshop.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    private UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String test = this.userService.handleHello();
        model.addAttribute("eric", test);
        model.addAttribute("hoidanit", "from controller with model");
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

// @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
// public String getnewForm(Model model, @ModelAttribute("newUser") User user) {
// System.out.println("User: " + user);
// System.out.println("create new user");
// this.userRepository.save(user);
// // Here you would typically handle the form submission, e.g., save the user
// to
// // the database
// return "hello";
// }

// }
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
