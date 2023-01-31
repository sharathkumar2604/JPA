package com.xworkz.chocolate.service;

import java.util.List;

import com.xworkz.chocolate.dto.ChocolateDto;

public interface ChocolateService {
	
	public boolean saveAll(List<ChocolateDto> dto);
	
	public List<ChocolateDto> readAll();
	
	public ChocolateDto findByColorAndWeight(String color,String weight);

	public ChocolateDto findByPriceAndName(int price,String name);
	
	public boolean updateWeightByNameAndColor(String weight,String name,String color);
	
	public boolean updateNameByIdAndWeight(String name,int id,String weight);
	
	public boolean deleteBycolorAndName(String color,String name);
	}

