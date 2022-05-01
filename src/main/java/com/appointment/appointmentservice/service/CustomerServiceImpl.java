package com.appointment.appointmentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment.appointmentservice.mapper.CustomerMapper;
import com.appointment.appointmentservice.model.CustomerVo;
import com.appointment.appointmentservice.repo.CustomerRepo;
@Service
public class CustomerServiceImpl implements ICustomerService{

    
	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public List<CustomerVo> retrieveCustomer() {
         
		return CustomerMapper.instance.fromEO(customerRepo.findAll());

	}

}
