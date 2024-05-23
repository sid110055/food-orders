package com.example.KFC.dao;

import com.example.KFC.dto.AddOnDTO;
import com.example.KFC.dto.CustomerDTO;
import com.example.KFC.dto.MenuDTO;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class KfcDao {
    private List<CustomerDTO> customerList = new ArrayList<>();
    private List<MenuDTO> menuList = new ArrayList<>();
    private List<AddOnDTO> addOnList = new ArrayList<>();


    public CustomerDTO getCustomerById(int id)
    {

        for(CustomerDTO customer : customerList)
        {
            if(customer.getCustomerId() == id)
            {
                return customer;
            }
        }
        return null;
    }

    public CustomerDTO addCustomer( CustomerDTO customer)
    {
        customerList.add(customer);
        return customer;
    }
    public MenuDTO getMenuById( int id)
    {
        for(MenuDTO menu : menuList)
        {
            if(menu.getId() == id)
            {
                return menu;
            }
        }
        return null;
    }

    public MenuDTO addMenu( MenuDTO menu)
    {
        menuList.add(menu);
        return menu;
    }

    public AddOnDTO getaddOnById(int id)
    {
        for(AddOnDTO addOn : addOnList)
        {
            if(addOn.getId() == id)
            {
                return addOn;
            }
        }
        return null;
    }

    public AddOnDTO addAddOn( AddOnDTO addOn)
    {
        addOnList.add(addOn);
        return addOn;
    }

}
