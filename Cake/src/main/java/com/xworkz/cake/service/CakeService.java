package com.xworkz.cake.service;

import java.util.List;

import com.xworkz.cake.dto.CakeDto;


public interface CakeService {
	
	public boolean save(CakeDto dto);
	
	public CakeDto findNameById(int id);
	
	public CakeDto readAll(List<CakeDto> list);
	
	public boolean updateNameById(String name,int id);
	
	public boolean deleteNameByID(String name, int id);
	

}
