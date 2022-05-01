package com.appointment.appointmentservice.service;

import java.util.List;

import com.appointment.appointmentservice.model.CustomerVo;

public interface ICustomerService {

	List<CustomerVo> retrieveCustomer();
	
}
