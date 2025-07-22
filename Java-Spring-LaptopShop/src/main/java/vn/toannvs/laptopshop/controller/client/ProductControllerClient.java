package vn.toannvs.laptopshop.controller.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

import vn.toannvs.laptopshop.service.ProductService;
import vn.toannvs.laptopshop.domain.Product;

@Controller
public class ProductControllerClient {

    private final ProductService productService;

    public ProductControllerClient(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/{id}")
    public String showProducts(@PathVariable("id") Long id, Model model) {
        Product product = this.productService.getProductById(id);
        model.addAttribute("product", product);
        return "client/product/show";
    }

}
