package com.example.KFC.dto;

import jakarta.validation.constraints.*;

public class CustomerDTO {


    @Min(value = 1,message = "CustomerID must be greater than or equal to 1 ")
    private int customerId;
    @NotBlank(message = "Name cannot be empty")
    @Size(min=2, max=50, message = "Name should be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Phone number cannot be empty")
    @Pattern(regexp = "^\\+?[0-9]{1,3}?[-. ]?(\\(?\\d{1,4}\\)?[-. ]?)?(\\d{1,4}[-. ]?){1,3}$", message = "Phone Number is invalid")

    // @Pattern(regexp = "^\\+?[0-9]{1,3}?[-. ]?(\\(?\\d{1,4}\\)?[-. ]?)?(\\d{1,4}[-. ]?){1,3}$",message = "Phone Number is invalid")
    private String phoneNumber;

    public CustomerDTO(int customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
