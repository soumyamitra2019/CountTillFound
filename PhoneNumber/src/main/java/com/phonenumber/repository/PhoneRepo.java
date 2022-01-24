package com.phonenumber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonenumber.entity.PhoneNumber;
@Repository
public interface PhoneRepo extends JpaRepository<PhoneNumber, String> {
	
}
