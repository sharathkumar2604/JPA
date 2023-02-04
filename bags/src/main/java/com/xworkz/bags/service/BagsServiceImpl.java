package com.xworkz.bags.service;

import java.util.List;

import com.xworkz.bags.dto.BagsDto;
import com.xworkz.bags.repo.BagsRepo;
import com.xworkz.bags.repo.BagsRepoImpl;

public class BagsServiceImpl implements BagsService {

	BagsRepo repo = new BagsRepoImpl();
	public boolean saveAll(List<BagsDto> dto) {
		if(dto!=null)
		{
			System.out.println("valid dto");
			for (BagsDto bagsDto : dto) {
				 repo.saveAll(bagsDto);
				
			}
			return true;
		}
		
		return false;
	}
	public List<BagsDto> readAll() {

		
		return repo.readAll();
	}
	public BagsDto findById(int id) {
if(id>0)
{
return repo.findById(id);
}
		
		return null;
	}
	public BagsDto findNameById(String name, int id) {
if(name.length()>1 && id>0)
{
	
	return repo.findNameById(name,id);
}
		
		
		return null;
	}
	public boolean updateNameById(String name, int id) {
if(name.length()>1 && id>0)
{
	repo.updateNameById(name,id);
	return true;
}
		
		
		return false;
	}
	public boolean updateNameByIdAndColor(String name, int id, String color) {
if(name.length()>1 && id>0 && color.length()>1)
{
	repo.updateNameByIdAndColor(name, id,color);
	return true;
}
		
		return false;
	}
	public boolean deleteById(int id) {
 if(id>0)
 {
	return repo.deleteById(id);
}
		
		return false;
	}
	public boolean deleteNameById(String name, int id) {

		 if(name.length()>1 && id>0)
		 {
			return repo.deleteNameById(name,id);
		}
				return false;
	}

}
