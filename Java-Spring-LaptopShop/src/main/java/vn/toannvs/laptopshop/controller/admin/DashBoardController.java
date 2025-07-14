package vn.toannvs.laptopshop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashBoardController {

    // This class is currently empty, but you can add methods to handle
    // dashboard-related requests.
    // For example, you might want to add methods to retrieve statistics or display
    // the dashboard view.

    // Example method to return a simple message
    @GetMapping("/admin")
    public String getDashboardMessage() {
        return "admin/dashboard/show";
    }

}
