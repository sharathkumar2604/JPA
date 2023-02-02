package com.xworkz.mobiles;

import com.xworkz.mobiles.dto.MobileDto;
import com.xworkz.mobiles.service.MobileService;
import com.xworkz.mobiles.service.MobileServiceImpl;

public class MobileRunner {
	
	public static void main(String[] args) {
		
		MobileService service = new MobileServiceImpl();
		
		MobileDto dto1 = new MobileDto(1,"Nokia", 1200,"black","keypad");
		MobileDto dto2 = new MobileDto(2,"Samsung", 12000,"blue","smartphone");
		MobileDto dto3 = new MobileDto(3,"Oppo", 17000,"gray","smartphone");
		MobileDto dto4 = new MobileDto(4,"Redmi", 1200,"brown","keypad");
		
		
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		
		
	}

}
