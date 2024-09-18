package com.example.buysell.services;

import com.example.buysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private int id = 1;

    public ProductService(){
        products.add(new Product(id++, "PS 5", "Best play station", 55000, "Makar", "Moscow"));
        products.add(new Product(id++, "PS 4", "Second best play station", 40000, "Michael", "Moscow"));
    }

    public Optional<Product> getProductById(int id){
        return products.stream().filter(el -> el.getId() == id).findFirst();
    }

    public boolean addProduct(Product product){
        product.setId(id++);
        return products.add(product);
    }

    public List<Product> getProducts(){
        return products;
    }

    public boolean deleteProductById(int id){
        return products.removeIf(el -> el.getId() == id);
    }




}
