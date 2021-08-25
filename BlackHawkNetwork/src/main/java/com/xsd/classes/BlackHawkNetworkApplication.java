package com.xsd.classes;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class BlackHawkNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlackHawkNetworkApplication.class, args);
	
	ObjectMapper mapper=new ObjectMapper();
	try {
		Student student=mapper.readValue(new File("data/simple.json"), Student.class);
		System.out.println("Student "+student.getId());
		System.out.println("F name "+student.getFirstName());
		System.out.println("S Name "+student.getLastName());
		System.out.println("Status "+student.isActive());
	} catch (JsonParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
