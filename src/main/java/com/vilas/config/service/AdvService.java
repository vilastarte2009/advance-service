package com.vilas.config.service;

import org.springframework.stereotype.Service;

import com.vilas.entity.Emp;


@Service
public class AdvService 
{
	
	public Emp getAdvanceAmount(int empId)
	{
		return new Emp(empId,null, 0, 0, ((empId%10)*1000)+1000, 0); 
		
	}

}
