package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Persons {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int pId;
	private String name;
	private String add;
	private int age;

	@OneToOne(mappedBy = "persons")
	private Aadhars aadhars;

	
	
	
	
	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Aadhars getAadhars() {
		return aadhars;
	}

	public void setAadhars(Aadhars aadhars) {
		this.aadhars = aadhars;
	}

}
