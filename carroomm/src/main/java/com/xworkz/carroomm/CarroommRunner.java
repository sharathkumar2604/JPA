package com.xworkz.carroomm;

import com.xworkz.carroomm.dto.CarroommDto;
import com.xworkz.carroomm.service.CarroommService;
import com.xworkz.carroomm.service.CarroommServiceImpl;

public class CarroommRunner {
	
	
	public static void main(String[] args) {
		
	CarroommService service = new CarroommServiceImpl();
	
	CarroommDto dto1 = new CarroommDto(1,"Precise Carro Board", "black and red", "plastic", 300);
	CarroommDto dto2 = new CarroommDto(2,"Synco Carrom Board", "black and white", "wooden", 1300);
	CarroommDto dto3 = new CarroommDto(3,"Surco Carrom Board", "brown and red", "fiber", 900);
	CarroommDto dto4 = new CarroommDto(4,"GSI Carrom Board", "red and marron", "metal", 10000);
	CarroommDto dto5 = new CarroommDto(5,"Siscaa Carrom Board", "yellow and red", "silver",33300);
	
//boolean status=service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
//		System.out.println(status);
	
	System.out.println(service.findNameById(3));
	
	System.out.println(service.updateNameById("GSI-Carrom-Board", 4));
	
	System.out.println(service.deleteById(5));
	}

}
