package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Persons;

public interface PersonsRepo extends JpaRepository<Persons, Integer>{

}
