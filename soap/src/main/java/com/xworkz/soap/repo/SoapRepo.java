package com.xworkz.soap.repo;

import java.util.List;

import com.xworkz.soap.dto.SoapDto;

public interface SoapRepo {

	public boolean create(SoapDto dto);

	public List<SoapDto> readAll();

	public SoapDto findById(int id);


	public SoapDto findByName(String name);

	public SoapDto findByColor(String color);

}
