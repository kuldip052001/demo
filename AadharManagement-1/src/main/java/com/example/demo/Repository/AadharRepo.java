package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Aadhars;

public interface AadharRepo extends JpaRepository<Aadhars, Integer> {

}
