package com.xworkz.bulb.repo;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;

public interface BulbRepo {


	public boolean create(BulbDto dto);

	public List<BulbDto> readAll();

	public BulbDto findById(int id);

	public List<BulbDto> findByName(String name);
	

}
