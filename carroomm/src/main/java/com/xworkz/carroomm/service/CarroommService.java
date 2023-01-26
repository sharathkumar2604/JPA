package com.xworkz.carroomm.service;

import com.xworkz.carroomm.dto.CarroommDto;

public interface CarroommService {
	
	public boolean save(CarroommDto dto);
	
	public CarroommDto findNameById(int id);
	
	public boolean updateNameById(String name,int id);
	
	public boolean deleteById(int id);

}
