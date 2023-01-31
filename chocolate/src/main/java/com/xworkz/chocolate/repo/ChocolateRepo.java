package com.xworkz.chocolate.repo;

import java.util.List;

import com.xworkz.chocolate.dto.ChocolateDto;

public interface ChocolateRepo {

	public boolean saveAll(ChocolateDto dto);

	public List<ChocolateDto> readAll();

	public ChocolateDto findByColorAndWeight(String color, String weight);

	public ChocolateDto findByPriceAndName(int price, String name);

	public boolean updateWeightByNameAndColor(String weight, String name, String color);

	public boolean updateWeightByNameAndColor(String name, int id, String weight);

	public boolean deleteBycolorAndName(String color, String name);

}
