package com.phonenumber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phonenumber.responseentity.Phone;
import com.phonenumber.service.PhoneService;

@RestController
public class MainController {
	@Autowired
	PhoneService phoneService;
	@PostMapping("generate")
	public ResponseEntity<String> phoneNumber(@RequestBody Phone body){
		phoneService.generatorService(body);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Hello");
	}
}
