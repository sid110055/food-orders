package com.example.KFC.dao;

import com.example.KFC.dto.AddOnDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddOnRepository extends JpaRepository<AddOnDTO,Integer> {
}
