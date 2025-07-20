package vn.toannvs.laptopshop.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/homepage")
    public String homePage() {
        return "client/homepage/show";
    }

}
