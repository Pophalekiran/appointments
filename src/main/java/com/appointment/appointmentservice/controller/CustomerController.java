package com.appointment.appointmentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.appointmentservice.model.CustomerVo;
import com.appointment.appointmentservice.service.ICustomerService;

@RestController
public class CustomerController {

	
	@Autowired
	ICustomerService customerSrevice;
	
	
	@GetMapping("/v1/customers")
	public List<CustomerVo> retrieveCustomers() {
		
		System.out.println("Data logged");
		return customerSrevice.retrieveCustomer();
		
	}
	
}
