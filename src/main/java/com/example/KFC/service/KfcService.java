package com.example.KFC.service;

import com.example.KFC.dao.AddOnRepository;
import com.example.KFC.dao.CustomerRepository;
import com.example.KFC.dao.MenuRepository;
import com.example.KFC.dto.AddOnDTO;
import com.example.KFC.dto.CustomerDTO;
import com.example.KFC.dto.MenuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KfcService {

    private CustomerRepository customerRepository;
    private MenuRepository menuRepository;
    private AddOnRepository addOnRepository;

    @Autowired
    public KfcService(CustomerRepository customerRepository,MenuRepository menuRepository,AddOnRepository addOnRepository) {
        this.customerRepository=customerRepository;
        this.menuRepository=menuRepository;
        this.addOnRepository=addOnRepository;
    }

    public CustomerDTO getCustomerById(int id)
    {
        Optional<CustomerDTO> customer =customerRepository.findById(id);
        return customer.orElse(null);
    }

    public CustomerDTO addCustomer(CustomerDTO customer)
    {
        return customerRepository.save(customer);
    }

    public MenuDTO getMenuById(int id)
    {
        Optional<MenuDTO> menu=menuRepository.findById(id);
        return menu.orElse(null);
    }

    public MenuDTO addMenu(MenuDTO menu)
    {
        return menuRepository.save(menu);
    }

    public AddOnDTO getAddOnById(int id)
    {
        Optional<AddOnDTO> addon = addOnRepository.findById(id);
        return addon.orElse(null);
    }

    public AddOnDTO addAddOn(AddOnDTO addon)
    {
        return addOnRepository.save(addon);
    }

}
