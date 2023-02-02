package com.xworkz.bulb;

import java.util.Arrays;
import java.util.List;

import com.xworkz.bulb.dto.BulbDto;
import com.xworkz.bulb.service.BulbService;
import com.xworkz.bulb.service.BulbServiceImpl;

public class BulbRunner {

	public static void main(String[] args) {

		BulbService service = new BulbServiceImpl();
		
		
		BulbDto dto1 = new BulbDto(1,"phillips","red","led", 500);
		BulbDto dto2 = new BulbDto(2,"usha","red","bed lamp", 120);
		BulbDto dto3 = new BulbDto(3,"bajaj","pink","bed lamp", 420);
		BulbDto dto4 = new BulbDto(4,"citra","white","bed lamp",520);
		BulbDto dto5 = new BulbDto(5,"panasonic","green","bed lamp", 320);
		BulbDto dto6 = new BulbDto(6,"Hpl","yellow","bed lamp", 220);
		BulbDto dto7 = new BulbDto(7,"havells","blue","bed lamp", 320);
		BulbDto dto8 = new BulbDto(8,"metro","purple","bed lamp", 444);
		BulbDto dto9 = new BulbDto(9,"metro1","purpe","bed lamp", 333);
		BulbDto dto10 = new BulbDto(10,"metro2","purle","bed lamp", 444);
		BulbDto dto11 = new BulbDto(11,"metro3","prple","bed lamp", 344);
		BulbDto dto12 = new BulbDto(12,"metro4","urple","bed lamp", 424);
		BulbDto dto13 = new BulbDto(13,"mro4","urle","ed lap", 324);
		BulbDto dto14 = new BulbDto(14,"mro4","urle","ed lap", 324);
		
		
//		service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
//		service.create(dto4);
//		service.create(dto5);
//		service.create(dto6);
//		service.create(dto7);
//		service.create(dto8);
		//service.create(dto9);
//		service.create(dto10);
//		service.create(dto11);
//		service.create(dto12);
//		service.create(dto14);
		
//		List<BulbDto> list = Arrays.asList(dto9,dto10,dto11,dto12);
//		service.create(list);
		
//		
//		List<BulbDto> list1 = service.readAll();
//		for (BulbDto bulbDto : list1) {
//			System.out.println(bulbDto);
//		}
//		
//		
//		System.out.println(service.findById(5));
//		
//		System.out.println(service.findByName("Havells"));
		
		for (BulbDto string :service.findByName("mro4") ) {
			
		
		System.out.println(string);
		}
		
	}	
	}

