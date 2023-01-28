package com.xworkz.soap.service;

import java.util.List;

import com.xworkz.soap.dto.SoapDto;

public interface SoapService {
	
	public boolean create(SoapDto dto);
	
	public List<SoapDto> readAll();
	
	public SoapDto findById(int id);
	
	public SoapDto findByName(String name);
	
	public SoapDto findByColor(String color);
	

}
