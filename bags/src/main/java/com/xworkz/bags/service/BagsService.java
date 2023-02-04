package com.xworkz.bags.service;

import java.util.List;

import com.xworkz.bags.dto.BagsDto;

public interface BagsService {

	
	public boolean saveAll(List<BagsDto> dto);
	
	public List<BagsDto> readAll();
	
	public BagsDto findById(int id);//normal no need to create named query
	
	public BagsDto findNameById(String name,int id);
	
	public boolean updateNameById(String name,int id);//normal no need to create named query
	
	public boolean updateNameByIdAndColor(String name,int id,String color);
	
	public boolean deleteById(int id);//normal no create named query
	
	public boolean deleteNameById(String name,int id); 
}
