package vn.toannvs.laptopshop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductContorller {

    @GetMapping("/admin/product")
    public String getProductPage() {
        // This method can be used to return the product management page.
        // You can add logic to retrieve products and pass them to the view if needed.
        return "admin/product/show"; // Adjust the view name as necessary
    }

}
