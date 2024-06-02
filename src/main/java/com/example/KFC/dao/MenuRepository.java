package com.example.KFC.dao;

import com.example.KFC.dto.MenuDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuDTO,Integer> {
}
