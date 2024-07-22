package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.service.StudentDetailsService;

@SpringBootApplication
public class MappingsOneToManyApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(MappingsOneToManyApplication.class, args);
    StudentDetailsService studentDetails = context.getBean(StudentDetailsService.class);
     System.out.println( " ********** STUDENT_DETAILS **********");
     System.out.println(studentDetails);
     studentDetails.addStudentAddress();
     
	}

}
