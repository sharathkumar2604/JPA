package com.xworkz.bulb.service;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;
import com.xworkz.bulb.repo.BulbRepo;
import com.xworkz.bulb.repo.BulbRepoImpl;

public class BulbServiceImpl implements BulbService {

	BulbRepo repo = new BulbRepoImpl();

	public boolean create(BulbDto dto) {
if(dto!=null)
{ 
//	for (BulbDto bulbDto:dto)
//
//{
//System.out.println(bulbDto);
	boolean status=
			repo.create(dto);
	System.out.println(status);
	return true;
	
}

return false;
	}
	public List<BulbDto> readAll() {

		return repo.readAll();
			

	}

	public BulbDto findById(int id) {
if(id>0)
{
	return repo.findById(id);
}
		
		return null;
	}

	public List<BulbDto> findByName(String name) {
if(name.length()>1)
{
	return repo.findByName(name);
}
	
		
		return null;
	}
}
