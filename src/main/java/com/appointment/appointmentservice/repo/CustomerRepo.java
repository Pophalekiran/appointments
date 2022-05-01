package com.appointment.appointmentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointment.appointmentservice.entities.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
