package com.xworkz.cake.service;

import java.util.List;

import com.xworkz.cake.dto.CakeDto;
import com.xworkz.cake.repo.CakeRepo;
import com.xworkz.cake.repo.CakeRepoImpl;

public class CakeServiceImpl implements CakeService {

	CakeRepo repo = new CakeRepoImpl();

	public boolean save(CakeDto dto) {

		if (dto != null) {
			System.out.println("valid");

			return repo.save(dto);

		}

		return false;
	}

	public CakeDto findNameById(int id) {

		if (id > 0) {
			return repo.findNameById(id);

		}

		return null;
	}
	
	

	public boolean updateNameById(String name, int id) {
		if (name.length() > 2 && id > 0) {
			repo.updateNameById(name, id);
			return true;
		}
		return false;
	}

	public boolean deleteNameByID(String name, int id) {
		if (name.length() > 2 && id > 0) {
			repo.deleteNameById(name, id);
			return true;
		}
		return false;
	}

	public CakeDto readAll(List<CakeDto> list) {
if(list!=null)
{
	
}
		
return null;

	}

}
