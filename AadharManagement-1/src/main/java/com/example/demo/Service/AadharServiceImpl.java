package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.AadharsDto;
import com.example.demo.Entity.Aadhars;
import com.example.demo.Entity.Persons;
import com.example.demo.Repository.AadharRepo;
import com.example.demo.Repository.PersonsRepo;

@Service
public class AadharServiceImpl implements AadharService{

	@Autowired
	AadharRepo aadharRepo;
	
	
	@Autowired
	PersonsRepo personsRepo;
	
	
	@Override
	public void addPersonInAadhar(AadharsDto dto) {
		
		Persons p=new Persons();
		p.setName(dto.getName());
		p.setAdd(dto.getAdd());
		
		
		personsRepo.save(p);
		
		
		Aadhars a=new Aadhars();
		a.setAadharNumber(dto.getAadharNumber());
		
		a.setPersons(p);
		
		
		aadharRepo.save(a);
		
		
		
	}

	
	
}
