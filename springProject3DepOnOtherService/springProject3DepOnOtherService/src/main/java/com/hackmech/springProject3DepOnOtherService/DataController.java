package com.hackmech.springProject3DepOnOtherService;

import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DataController {
	
	@GetMapping("/location")
	public String getLocation() {
		return "pune";
	}
	
	@GetMapping("/weather")
	public String getWeather() {
		RestTemplate template = new RestTemplate();
		String data = template.getForEntity("http://localhost:8080/location", String.class).getBody();
		return data + " 45c";
		
		
	}
	
	//join point where problem might be created
	//point cut is exact location where advice is used
			
	//Before advice
	//After advice
	//around advice
	//after throwing advice	
	@GetMapping("/student/error/{datacode}")
	public int checkForError(@PathVariable int datacode) throws Exception {
		if(datacode ==1 ) {
			throw new Exception();
		}
		else {
			return datacode;
		}
	}
	
	
}
