package vn.toannvs.laptopshop.controller;

import vn.toannvs.laptopshop.domain.User;
import vn.toannvs.laptopshop.repository.UserRepository;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.toannvs.laptopshop.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        List<User> users = this.userService.getAllUSers();
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

    @RequestMapping("/admin/user/create")
    public String createUser(Model model) {
        model.addAttribute("newUser", new User());
        List<User> users = this.userService.getAllUSers();
        model.addAttribute("users", users);
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
    public String getnewForm(Model model, @ModelAttribute("newUser") User user) {
        System.out.println("User: " + user);
        System.out.println("create new user");
        this.userService.handleSaveUser(user);
        return "hello";
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
