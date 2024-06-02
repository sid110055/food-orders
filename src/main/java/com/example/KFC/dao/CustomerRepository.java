package com.example.KFC.dao;

import com.example.KFC.dto.CustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDTO,Integer> {
}
