package vn.toannvs.laptopshop.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import vn.toannvs.laptopshop.service.UserService;
// @Controller
// public class UserController {

//     @RequestMapping("/")
//     public String getHomePage() {
//         return "hello form controller";
//     }
// }
@RestController()
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getHomePage() {
        return this.userService.handleHello();
    }
}
