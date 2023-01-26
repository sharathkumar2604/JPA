package com.xworkz.carroomm.repo;

import com.xworkz.carroomm.dto.CarroommDto;

public interface CarroommRepo {

	public boolean save(CarroommDto dto);

	public CarroommDto findNameById(int id);
	
	public boolean updateNameById(String name,int id);
	
	public boolean deleteById(int id);

}
