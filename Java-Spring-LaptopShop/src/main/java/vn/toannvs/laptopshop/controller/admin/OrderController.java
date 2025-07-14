package vn.toannvs.laptopshop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @GetMapping("/admin/order")
    public String getOrderPage() {
        // This method can be used to return the order management page.
        // You can add logic to retrieve orders and pass them to the view if needed.
        return "admin/order/show"; // Adjust the view name as necessary
    }

}
