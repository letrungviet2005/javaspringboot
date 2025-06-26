package vn.toannvs.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello, my name is Viet";
    }

    @GetMapping("/user")
    public String userPage() {
        return "Only user can access this page";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Only admin can access this page";
    }
}
