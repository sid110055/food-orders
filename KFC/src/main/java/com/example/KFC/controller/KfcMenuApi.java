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

    //http://localhost:8080/kfc/customer/1
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

//    {
//        "customerId": 1,
//            "name": "Peter Sagar",
//            "phoneNumber": "+1 8521479637"
//    }

    //http://localhost:8080/kfc/customer
    @PostMapping("/customer")
    public ResponseEntity<CustomerDTO> addCustomer(@Valid  @RequestBody CustomerDTO customer)
    {  CustomerDTO addedCustomer = kfcservice.addCustomer(customer);
        return new ResponseEntity<>(addedCustomer,HttpStatus.CREATED);
    }


    //http://localhost:8080/kfc/menu/1
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


    //    {
//        "id": 1,
//            "price": 25,
//            "menuItem": "Chicken Popcorn"
//    }

    //http://localhost:8080/kfc/menu
    @PostMapping("/menu")
    public ResponseEntity<MenuDTO> addMenu( @Valid @RequestBody MenuDTO menu)
    {
        MenuDTO addedMenu = kfcservice.addMenu(menu);
        return new ResponseEntity<>(addedMenu, HttpStatus.CREATED);
    }

    //http://localhost:8080/kfc/addon/1
    @GetMapping("/addon/{id}")
    public ResponseEntity<AddOnDTO> getAddOnById(@PathVariable int id)
    {
        AddOnDTO addon = kfcservice.getAddOnById(id);
        if(addon == null){return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
        return new ResponseEntity<>(addon, HttpStatus.OK);
    }
    //    {
//        "id": 1,
//            "price": 25,
//            "description": "Chicken Popcorn"
//    }

    //http://localhost:8080/kfc/addon
    @PostMapping("addon")
    public ResponseEntity<AddOnDTO> addAddOn( @Valid @RequestBody AddOnDTO addon)
    {
        AddOnDTO addedAddOn = kfcservice.addAddOn(addon);
        return new ResponseEntity<>(addedAddOn, HttpStatus.CREATED);
    }

}
