package com.xworkz.mobiles.service;

import com.xworkz.mobiles.dto.MobileDto;

import com.xworkz.mobiles.repo.MobileRepo;
import com.xworkz.mobiles.repo.MobileRepoImpl;

public class MobileServiceImpl implements MobileService{

	MobileRepo repo = new MobileRepoImpl();
	public boolean save(MobileDto dto) {

		if(dto!=null)
		{
			boolean status= repo.save(dto);
			System.out.println(status);
			return true;
			
		}
		
		
		return false;
	}

}
