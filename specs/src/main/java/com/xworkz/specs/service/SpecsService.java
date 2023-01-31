package com.xworkz.specs.service;

import java.util.List;

import com.xworkz.specs.dto.SpecsDto;

public interface SpecsService {

	public boolean save(List<SpecsDto> dto);
	
	public List<SpecsDto> readAll();
	
	public SpecsDto findById(int id);
	
	public SpecsDto findByTypeAndPrice(String type,int price);
	
	public SpecsDto findByName(String name);
	
	public boolean updatePriceByName(int price,String name);
	
	public boolean updateColorByPriceAndType(String color,int price,String type);
	
	public boolean deleteByPriceAndColor(int price, String color);
	
	public boolean deleteByNameAndId(String name ,int id);
	
}
