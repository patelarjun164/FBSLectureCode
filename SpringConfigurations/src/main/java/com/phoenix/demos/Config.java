package com.phoenix.demos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	public Config() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean
	public Consultant createConsultant()
	{
		return new Consultant();		
	}

}
