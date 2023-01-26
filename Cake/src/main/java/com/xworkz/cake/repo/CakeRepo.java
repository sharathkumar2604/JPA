package com.xworkz.cake.repo;

import com.xworkz.cake.dto.CakeDto;

public interface CakeRepo {
	
	public boolean save(CakeDto dto);


	public CakeDto findNameById(int id);
	
	
	public boolean updateNameById(String name,int id);


	public boolean deleteNameById(String name, int id);

}
