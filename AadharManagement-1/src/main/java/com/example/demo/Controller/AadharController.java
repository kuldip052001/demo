package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.AadharsDto;
import com.example.demo.Service.AadharServiceImpl;

@RestController
public class AadharController {
@Autowired
AadharServiceImpl aadharserviceImpl;




@PostMapping ("aadhar")
ResponseEntity assignAadhar(@RequestBody AadharsDto dto) {
	
	aadharserviceImpl.addPersonInAadhar(dto);
	return new ResponseEntity("data is added",HttpStatus.CREATED);
}
	
}
