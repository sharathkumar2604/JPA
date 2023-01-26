package com.xworkz.carroomm.service;

import com.xworkz.carroomm.dto.CarroommDto;
import com.xworkz.carroomm.repo.CarroommRepo;
import com.xworkz.carroomm.repo.CarroommRepoImpl;

public class CarroommServiceImpl implements CarroommService {


	CarroommRepo repo = new CarroommRepoImpl();

	public boolean save(CarroommDto dto) {

		if (dto != null) {
			System.out.println("valid");

			return repo.save(dto);

		}

		return false;
	}

	public CarroommDto findNameById(int id) {
		if(id>0)
		{
			return repo.findNameById(id);
		}

		
		return null;
	}

	public boolean updateNameById(String name, int id) {
if(name.length()>2&&id>0)
{
	      repo.updateNameById(name,id);
          return true;
}
		return false;
	}

	public boolean deleteById(int id) {
		if(id>0)
		{
			      repo.deleteById(id);
		          return true;
		}
				return false;
			}

}
