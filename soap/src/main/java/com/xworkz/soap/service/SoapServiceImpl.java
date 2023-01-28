package com.xworkz.soap.service;

import java.util.List;

import com.xworkz.soap.dto.SoapDto;
import com.xworkz.soap.repo.SoapRepo;
import com.xworkz.soap.repo.SoapRepoImpl;

public class SoapServiceImpl implements SoapService {

	SoapRepo repo = new SoapRepoImpl();

	public boolean create(SoapDto dto) {
		if (dto != null) {
			return repo.create(dto);
		}
		return false;
	}

	public List<SoapDto> readAll() {

		return repo.readAll();

	}

	public SoapDto findById(int id) {
		if (id > 0) {
			return repo.findById(id);
		}

		return null;
	}

	public SoapDto findByName(String name) {
		if (name.length() > 1) {
			return repo.findByName(name);
		}
		return null;
	}

	public SoapDto findByColor(String color) {
if(color.length()>1)
{
	return repo.findByColor(color);
}
		
		return null;
	}

}
