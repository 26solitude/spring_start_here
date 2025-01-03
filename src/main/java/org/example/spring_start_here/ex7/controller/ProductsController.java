package org.example.spring_start_here.ex7.controller;

import org.example.spring_start_here.ex7.model.Product;
import org.example.spring_start_here.ex7.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductsController {
    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

//    @PostMapping("/products")
//    public String addProduct(@RequestParam String name,
//                             @RequestParam double price,
//                             Model Account) {
//        Product p = new Product();
//        p.setName(name);
//        p.setPrice(price);
//        productService.addProduct(p);
//
//        var products = productService.findAll();
//        Account.addAttribute("products", products);
//
//        return "products.html";
//    }

    @PostMapping("/products")
    public String addProduct(Product p,
                             Model model) {
        productService.addProduct(p);

        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }
}
