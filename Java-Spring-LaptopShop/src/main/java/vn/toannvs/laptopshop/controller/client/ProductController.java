package vn.toannvs.laptopshop.controller.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String showProducts() {
        return "client/product/show";
    }

}
