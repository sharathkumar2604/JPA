package com.xworkz.refil.repo;

import java.util.List;

import com.xworkz.refil.dto.RefilDto;

public interface RefilRepo {

	public boolean saveAll(RefilDto dto);

	public List<RefilDto> readAll();

	public RefilDto findById(int id);

	public RefilDto findNameByIdAndColor(String name, int id, String color);

}
