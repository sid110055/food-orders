package com.example.KFC.service;

import com.example.KFC.dao.KfcDao;
import com.example.KFC.dto.AddOnDTO;
import com.example.KFC.dto.CustomerDTO;
import com.example.KFC.dto.MenuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KfcService {


    private KfcDao kfcdao;
    @Autowired
    public KfcService(KfcDao kfcdao) {
        this.kfcdao = kfcdao;
    }

    public CustomerDTO getCustomerById(int id)
    {
        return kfcdao.getCustomerById(id);
    }

    public CustomerDTO addCustomer(CustomerDTO customer)
    {
        return kfcdao.addCustomer(customer);
    }

    public MenuDTO getMenuById(int id)
    {
        return kfcdao.getMenuById(id);
    }

    public MenuDTO addMenu(MenuDTO menu)
    {
        return kfcdao.addMenu(menu);
    }

    public AddOnDTO getAddOnById(int id)
    {
        return kfcdao.getaddOnById(id);
    }

    public AddOnDTO addAddOn(AddOnDTO addon)
    {
        return kfcdao.addAddOn(addon);
    }

}
