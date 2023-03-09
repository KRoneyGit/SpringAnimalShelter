package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Owner;
import dmacc.beans.Pet;

/**
* @author Kevin Roney - karoney
* CIS 175 - Fall 2023
* Mar 7, 2023
*/
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Pet pet() {
		Pet bean = new Pet();
		return bean;
	}
	@Bean
	public Owner owner() {
		Owner bean = new Owner();
		return bean;
	}
}
