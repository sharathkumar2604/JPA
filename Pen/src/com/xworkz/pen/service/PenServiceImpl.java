package com.xworkz.pen.service;

import java.util.List;


import com.xworkz.pen.dto.PenDto;
import com.xworkz.pen.repo.PenRepo;
import com.xworkz.pen.repo.PenRepoImpl;

public class PenServiceImpl implements PenService {

	PenRepo repo = new PenRepoImpl();
	
	@Override
	public boolean save(PenDto dto) {
if(dto!=null)
{
	System.out.println("valid dto");
  repo.save(dto);
return true;
}
		return false;
	}

	@Override
	public List<PenDto> readAll() {

		return repo.readAll();
	

}

	@Override
	public PenDto findById(int id) {
if(id>0)
{
	return repo.findById(id);
	
}
	
		
		
		return null;
	}
}