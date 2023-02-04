package com.xworkz.bags.repo;

import java.util.List;

import com.xworkz.bags.dto.BagsDto;

public interface BagsRepo {

	public boolean saveAll(BagsDto dto);

	public List<BagsDto> readAll();

	public BagsDto findById(int id);

	public BagsDto findNameById(String name, int id);

	public boolean updateNameById(String name, int id);

	public boolean updateNameByIdAndColor(String name, int id, String color);

	public boolean deleteById(int id);

	public boolean deleteNameById(String name, int id);

}
