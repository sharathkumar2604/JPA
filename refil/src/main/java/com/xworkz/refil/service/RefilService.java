package com.xworkz.refil.service;

import java.util.List;

import com.xworkz.refil.dto.RefilDto;

public interface RefilService {
	
	public boolean saveAll(List<RefilDto> dto);
	
	public List<RefilDto> readAll();
	
	public RefilDto findById(int id);
	
	public RefilDto findNameByIdAndColor(String name,int id,String color);


}
