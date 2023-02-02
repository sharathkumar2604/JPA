package com.xworkz.specs;

import java.util.Arrays;
import java.util.List;

import com.google.protobuf.Service;
import com.xworkz.specs.dto.SpecsDto;
import com.xworkz.specs.service.SpecsService;
import com.xworkz.specs.service.SpecsServiceImpl;

public class SpecsRunner {
	
	public static void main(String[] args) {
		
		SpecsService service = new SpecsServiceImpl();
		
		SpecsDto dto1 = new SpecsDto(1,"Fasttrack","white", 1233,"Powerglass");
		SpecsDto dto2 = new SpecsDto(2,"Titan","red", 1433,"Computerglass");
		SpecsDto dto3 = new SpecsDto(3,"Rayban","black", 1533,"Normalglass");
		SpecsDto dto4 = new SpecsDto(4,"Gucci","orange", 1633,"Powerglass");
		SpecsDto dto5 = new SpecsDto(5,"Police","white-black", 1733,"Computerglass");
		
		
//		List<SpecsDto> lis =Arrays.asList(dto1,dto2,dto3,dto4,dto5);
//		service.save(lis);
		System.out.println("----------------------------+++++++++++");
		for (SpecsDto specsDto : service.readAll()) {
			System.out.println(specsDto);
		}
		System.out.println("===========================");
		System.out.println(service.findById(2));
		System.out.println("-------------------------------");
		
		
//		System.out.println(service.findByTypeAndPrice("Computerglass", 1733));
//		
//		System.out.println("--------------------------------------");
//		
//		System.out.println(service.findByName("Gucci"));
//		
//		
//		System.out.println(service.updatePriceByName(1333, "Fasttrack"));
//		
//		System.out.println("----------------------------------------");
//		
//		System.out.println(service.updateColorByPriceAndType("brown",1633, "Powerglass"));
//	
//	System.out.println("----------------------------------------------");
//	System.out.println(service.deleteByPriceAndColor(1733,"white-black"));
//	
	System.out.println("-----------------------------------");
	System.out.println(service.deleteByNameAndId("Gucci", 4));
	
	}

}
