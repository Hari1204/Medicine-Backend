package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Temp;

public interface TempDao extends JpaRepository<Temp, Integer> {

}
