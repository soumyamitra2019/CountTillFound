package com.phonenumber.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonenumber.entity.PhoneNumber;
import com.phonenumber.repository.PhoneRepo;
import com.phonenumber.responseentity.Phone;

@Service
public class PhoneService {
	@Autowired
	PhoneRepo phoneRepo;

	public void generatorService(Phone phone) {
		// phone.setCountryCode(phone.getCountryCode());
		List<PhoneNumber> numbers = new ArrayList<>();
		Integer number = 1000000;
		long i = 0;
		while (number < 9999999) {
			while (number % 10000 == 0) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setPhoneNo(phone.getCountryCode() + phone.getAreaCode() + number);
				phoneNumber.setName(phone.getCountryCode() + phone.getAreaCode() + i++);
				numbers.add(phoneNumber);
				number++;
			}
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNo(phone.getCountryCode() + phone.getAreaCode() + number);
			phoneNumber.setName(phone.getCountryCode() + phone.getAreaCode() + i++);
			numbers.add(phoneNumber);
			phoneRepo.saveAll(numbers);
			number++;
		}
	}
}
