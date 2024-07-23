package com.scaler.productservicemorningbatch.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private long id;
    private String title;
    private String description;
    private Category category;
    private String image;
    private double price;
}
