package com.xworkz.soap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.xworkz.soap.dto.SoapDto;
import com.xworkz.soap.service.SoapService;
import com.xworkz.soap.service.SoapServiceImpl;

public class SoapRunner {

	public static void main(String[] args) {

		SoapService service = new SoapServiceImpl();
		
		SoapDto dto1 = new SoapDto(1, "Santoor","Orange",25, "250gram");
		SoapDto dto2 = new SoapDto(2, "LifeBuoy","Red",35, "150gram");
		SoapDto dto3 = new SoapDto(3, "MysoreSandal","Gray",45, "350gram");
		SoapDto dto4 = new SoapDto(4, "Dettol","White",15, "50gram");
		SoapDto dto5 = new SoapDto(5, "AcneStar","White",45, "350gram");
		SoapDto dto6 = new SoapDto(6, "Pear","Blue",55, "350gram");
		SoapDto dto7 = new SoapDto(7, "Medimix","green",5, "25gram");
		SoapDto dto8 = new SoapDto(8, "Cinthol","Purple",20, "250gram");
		SoapDto dto9 = new SoapDto(9, "Panthanjali","Maroon",12, "230gram");
		SoapDto dto10 = new SoapDto(10, "Lux","Pink",30, "200gram");

		
//		service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
//		service.create(dto4);
//		service.create(dto5);
//		service.create(dto6);
//		service.create(dto7);
//		service.create(dto8);
//		service.create(dto9);
//		service.create(dto10);
		
		
//		List<SoapDto> list = service.readAll();
//		for (SoapDto soapDto : list) {
//			
//		
//		System.out.println(soapDto);
////		
//		
//	}

//		System.out.println(service.findById(2));
		System.out.println("------------------------------");
		System.out.println(service.findByName("Santoor"));
		System.out.println("------------------------------");
		
		
			System.out.println(service.findByColor("orange"));
				
}
}