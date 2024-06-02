package com.example.KFC.controller;

import com.example.KFC.dto.AddOnDTO;
import com.example.KFC.dto.CustomerDTO;
import com.example.KFC.dto.MenuDTO;
import com.example.KFC.service.KfcService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/kfc")
public class KfcMenuApi {

    private KfcService kfcservice;
    @Autowired
    public KfcMenuApi(KfcService kfcservice) {
        this.kfcservice = kfcservice;
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable int id)
    {
        CustomerDTO customer = kfcservice.getCustomerById(id);
        if(customer == null)
        {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }

    @PostMapping("/customer")
    public ResponseEntity<CustomerDTO> addCustomer(@Valid  @RequestBody CustomerDTO customer)
    {  CustomerDTO addedCustomer = kfcservice.addCustomer(customer);
        return new ResponseEntity<>(addedCustomer,HttpStatus.CREATED);
    }

    @GetMapping("/menu/{id}")
    public ResponseEntity<MenuDTO> getMenuById(@PathVariable int id)
    {
        MenuDTO menu = kfcservice.getMenuById(id);
        if(menu == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(menu, HttpStatus.OK);
    }

    @PostMapping("/menu")
    public ResponseEntity<MenuDTO> addMenu( @Valid @RequestBody MenuDTO menu)
    {
        MenuDTO addedMenu = kfcservice.addMenu(menu);
        return new ResponseEntity<>(addedMenu, HttpStatus.CREATED);
    }

    @GetMapping("/addon/{id}")
    public ResponseEntity<AddOnDTO> getAddOnById(@PathVariable int id)
    {
        AddOnDTO addon = kfcservice.getAddOnById(id);
        if(addon == null){return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
        return new ResponseEntity<>(addon, HttpStatus.OK);
    }

    @PostMapping("addon")
    public ResponseEntity<AddOnDTO> addAddOn( @Valid @RequestBody AddOnDTO addon)
    {
        AddOnDTO addedAddOn = kfcservice.addAddOn(addon);
        return new ResponseEntity<>(addedAddOn, HttpStatus.CREATED);
    }

}
