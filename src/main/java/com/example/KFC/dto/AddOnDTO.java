package com.example.KFC.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class AddOnDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1,message = "MenuID must be greater than or equal to 1 ")
    private int id;

    @NotBlank(message = "Menu Item cannot be blank")
    @Size(min = 2, max=100,message = "AddOn description should have a name it should be between 2 and 100 characters")
    private String description;

    @Min(value=0, message = "Menu Item Price should be greater than or equal to 0")
    private float price;

    public AddOnDTO() {
    }

    public AddOnDTO(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
