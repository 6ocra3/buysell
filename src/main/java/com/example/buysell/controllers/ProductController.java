package com.example.buysell.controllers;

import com.example.buysell.models.Product;
import com.example.buysell.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/")
    public String products(Model model){
        model.addAttribute("products", productService.getProducts());
        return "products";
    }

    @PostMapping("/product/create")
    public String addProducts(@ModelAttribute Product product){
        productService.addProduct(product);
        return "redirect:/";
    }

    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        productService.deleteProductById(id);
        return "redirect:/";
    }

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable int id, Model model){
        Optional<Product> product = productService.getProductById(id);
        if(product.isPresent()){
            model.addAttribute("product", product.get());
            return "product-page";
        }
        return "redirect:/";

    }
    
}
