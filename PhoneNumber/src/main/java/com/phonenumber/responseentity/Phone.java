package com.phonenumber.responseentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Phone {
	private String countryCode;
	private String areaCode;
}
