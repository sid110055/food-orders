package com.example.KFC.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class MenuDTO {

    @Min(value = 1,message = "MenuID must be greater than or equal to 1 ")
    private int id;

    @Min(value=0, message = "Menu Item Price should be greater than or equal to 0")
    private float price;

    @NotBlank(message = "Menu Item cannot be blank")
    @Size(min = 2, max=100,message = "Menu Item should have a name it should be between 2 and 100 characters")
    private String menuItem;


    public MenuDTO(int id, float price, String menuItem) {
        this.id = id;
        this.price = price;
        this.menuItem = menuItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }
}
