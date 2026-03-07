package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Aadhars {

	
	@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long aId;
	private String aadharNumber;
	
	@OneToOne
	@JoinColumn(name = "Person_id",unique = true)
	
	 private Persons persons;
	
	
	

	public Long getaId() {
		return aId;
	}

	public void setaId(Long aId) {
		this.aId = aId;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public Persons getPersons() {
		return persons;
	}

	public void setPersons(Persons persons) {
		this.persons = persons;
	}
	
	
	
}
