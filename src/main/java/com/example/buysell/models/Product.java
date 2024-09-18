package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
@AllArgsConstructor
@Builder
public class Product {
    @Nullable
    private long id;
    private String title;
    private String description;
    private int price;
    private String author;
    private String city;

}
