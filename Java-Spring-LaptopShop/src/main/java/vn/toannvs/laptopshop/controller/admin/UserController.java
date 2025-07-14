package vn.toannvs.laptopshop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("admin/user")
    public String getAdminUser() {
        return "admin/user";
    }

}
