package com.xworkz.specs.service;

import java.util.List;
import java.util.jar.Attributes.Name;

import com.xworkz.specs.dto.SpecsDto;
import com.xworkz.specs.repo.SpecsRepo;
import com.xworkz.specs.repo.SpecsRepoImpl;

public class SpecsServiceImpl implements SpecsService {

	SpecsRepo repo = new SpecsRepoImpl();

	public boolean save(List<SpecsDto> dto) {
		if (dto != null) {
			for (SpecsDto dt : dto) {

				System.out.println("valid dto");
				repo.save(dt);
			}
			return true;
		}

		return false;
	}

	public List<SpecsDto> readAll() {

     return repo.readAll();
 

	
	}

	public SpecsDto findById(int id) {
 if(id>0) {
	 return repo.findById(id);
 }
		
		return null;
	}

	public SpecsDto findByTypeAndPrice(String type, int price) {
if(type.length()>3&&price>999)
{
	return repo.findByTypeAndPrice(type,price);
	
}
		
		
		return null;
	}

	public SpecsDto findByName(String name) {
if(name.length()>2)
{
	return repo.findByName(name);
	
}
		
		return null;
	}

	public boolean updatePriceByName(int price, String name) {
if(price>0&&name.length()>2) {
	return repo.updatePriceByName(price,name);
}
		
		
		return false;
	}

	public boolean updateColorByPriceAndType(String color, int price, String type) {
if(color.length()>1&&price>100&&type.length()>2)
{
	return repo.updateColorByPriceAndType(color,price,type);
	
}
		
		
		return false;
	}

	public boolean deleteByPriceAndColor(int price, String color) {
if(price>999&&color.length()>2)
{
	return repo.deleteByPriceAndColor(price,color);
}
		
		return false;
	}

	public boolean deleteByNameAndId(String name, int id) {

		if(name.length()>2&&id>0)
		{
			return repo.deleteByNameAndId(name,id);
		}
				
		return false;
	}

}
