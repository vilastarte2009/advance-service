package com.vilas.config.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vilas.config.service.AdvService;
import com.vilas.entity.Emp;

@RestController
public class AdvController 
{
	@Autowired
	AdvService adService;

	Logger logger = LoggerFactory.getLogger(AdvController.class);
	
	@GetMapping(value = "/{empId}")
	Emp  show(@PathVariable("empId") int empId)
	{	
		System.out.println("AdvService controller is called...");
		logger.info("Advance service is called emp_id =>{} ",empId);
		return adService.getAdvanceAmount(empId);
		
	}
	
	
	
}
