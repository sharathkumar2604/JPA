package com.xworkz.chocolate.service;

import java.util.List;

import com.xworkz.chocolate.dto.ChocolateDto;
import com.xworkz.chocolate.repo.ChocolateRepo;
import com.xworkz.chocolate.repo.ChocolateRepoImpl;

public class ChocolateServiceImpl implements ChocolateService {

	ChocolateRepo repo = new ChocolateRepoImpl();
	public boolean saveAll(List<ChocolateDto> dto) {
		if(dto!=null)
		{
			System.out.println("valid");
			for (ChocolateDto li : dto) {
				repo.saveAll(li);
			}
			return true;
		}
		
		return false;
	}
	
	public List<ChocolateDto> readAll() {
        
		return repo.readAll();
		
	}

	public ChocolateDto findByColorAndWeight(String color, String weight) {
		if(color.length()>1 && weight.length()>2)
		{
			return repo.findByColorAndWeight(color,weight);
		}
		
		return null;
	}

	public ChocolateDto findByPriceAndName(int price, String name) {
if(price>0 && name.equalsIgnoreCase(name))
{
	return repo.findByPriceAndName(price,name);
}
		
		return null;
	}

	public boolean updateWeightByNameAndColor(String weight, String name, String color) {
if(weight.length()>1 && name.length()>2 && color.length()>1)
{
	return repo.updateWeightByNameAndColor(weight,name,color);
}
		
		return false;
	}

	public boolean updateNameByIdAndWeight(String name, int id, String weight) {
		if(name.length()>1 && id>2 && weight.length()>1)
		{
			return repo.updateWeightByNameAndColor(name,id,weight);
		}
			
		
		return false;
	}

	public boolean deleteBycolorAndName(String color, String name) {
if(color.length()>1 && name.length()>1)
{
	return repo.deleteBycolorAndName(color,name);
}
		
		return false;
	}


}
