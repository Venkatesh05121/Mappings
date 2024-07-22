package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AddressDetails;
import com.example.demo.model.StudentDetails;
import com.example.demo.repository.StudentDetailsRepository;

@Service
public class StudentDetailsService {
	
	@Autowired
	StudentDetailsRepository stuRepository;
	
	public String addStudentAddress() {
		List<AddressDetails> addresses = new ArrayList<>();
		AddressDetails homeAddress = new AddressDetails();
		homeAddress.setState("Andhra Pradesh");
		homeAddress.setCity("Guntur");
		homeAddress.setArea("Macherla");
		homeAddress.setZipcode(522426);
		addresses.add(homeAddress);
		
		AddressDetails hostelAddress = new AddressDetails();
		hostelAddress.setState("Telangana");
		hostelAddress.setCity("Hyderabad");
		hostelAddress.setArea("Ameerpet");
		hostelAddress.setZipcode(500026);
		addresses.add(hostelAddress);
		
		StudentDetails student = new StudentDetails();
		student.setStuName("Pavan");
		student.setEmail("pavan@gmail.com");
		student.setMobile("7595759585");
		student.setAddress(addresses);
		
		StudentDetails mappedStudents = stuRepository.save(student);
		
		return "Students was successfully Submitted by Mappings(1 : N) " + mappedStudents.getStuName();
		
	}
	

	
	
}
