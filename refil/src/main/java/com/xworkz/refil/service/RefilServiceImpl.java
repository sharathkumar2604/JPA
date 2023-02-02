package com.xworkz.refil.service;

import java.util.List;

import com.xworkz.refil.dto.RefilDto;
import com.xworkz.refil.repo.RefilRepo;
import com.xworkz.refil.repo.RefilRepoImpl;

public class RefilServiceImpl implements RefilService {

	RefilRepo repo = new RefilRepoImpl();

	public boolean saveAll(List<RefilDto> dto) {
		if (dto != null) {
			for (RefilDto li : dto) {

				repo.saveAll(li);

			}
			return true;
		}

		return false;
	}

	public List<RefilDto> readAll() {

		return repo.readAll();

	}

	public RefilDto findById(int id) {
if(id>0)
{
	return repo.findById(id);
}
		
		return null;
	}

	public RefilDto findNameByIdAndColor(String name, int id, String color) {
if(name.length()>2 && id>0 &&color.length()>1)
{
	return repo.findNameByIdAndColor(name,id,color);
}
		
		return null;
	}
	
}