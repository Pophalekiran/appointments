package com.appointment.appointmentservice.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.appointment.appointmentservice.entities.Customer;
import com.appointment.appointmentservice.model.CustomerVo;

@Mapper
public interface CustomerMapper {

	CustomerMapper instance = Mappers.getMapper(CustomerMapper.class);
	
	List<CustomerVo> fromEO(List<Customer> source);
}
