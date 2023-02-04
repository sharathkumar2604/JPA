package com.xworkz.bags;

import java.util.Arrays;
import java.util.List;

import com.xworkz.bags.dto.BagsDto;
import com.xworkz.bags.service.BagsService;
import com.xworkz.bags.service.BagsServiceImpl;

public class BagsRunner {
	public static void main(String[] args) {
		
	
	
	BagsService service = new BagsServiceImpl() ;
	
	BagsDto dto1 = new BagsDto(1,"American-Tourister","black","college-bag", 1200);
	BagsDto dto2 = new BagsDto(2,"Sky-Bags","brown","laptop-bag", 900);
	BagsDto dto3 = new BagsDto(3,"Wild-Craft","red","lugage-bag", 1400);
	BagsDto dto4 = new BagsDto(4,"Lunars","maroon","school-bag", 700);
	BagsDto dto5 = new BagsDto(5,"Safari","green","college", 1800);
	BagsDto dto6 = new BagsDto(6,"Gear","blue","college-school-bag", 1899);
	BagsDto dto7 = new BagsDto(7,"Mysore-Tarpaulins","purple","office-bag", 1100);
	BagsDto dto8 = new BagsDto(8,"Dell","grayish","trolly-bag", 1100);
	
	
	System.out.println("=====================================saveAll================================================");
//	List<BagsDto> lis = Arrays.asList(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8);
//
//	service.saveAll(lis);
	System.out.println("------------------------------------------------------------------------------------------------");
	System.out.println("=====================================readAll=================================================");
	for (BagsDto read :service.readAll()) {
		System.out.println(read);
	}
	
	System.out.println("-------------------------------------------------------------------------------------------------");
	System.out.println("=====================================findById=================================================");	
	
	System.out.println(service.findById(3));
	
	System.out.println("--------------------------------------------------------------------------------------------------");
	System.out.println("====================================findNameById==================================================");
	
	System.out.println(service.findNameById("safari", 5));

	System.out.println("------------------------------------------------------------------------------------------------------");
	System.out.println("===================================updateNameById===================================================");
	
	//System.out.println(service.updateNameById("VIP", 8));
	
	
	System.out.println("------------------------------------------------------------------------------------------------------");
	System.out.println("===================================updateNameByIdAndColor===============================================");
	
	System.out.println(service.updateNameByIdAndColor("gear", 6,"blue"));
	
	System.out.println("---------------------------------------------------------------------------------------------------------------");
	System.out.println("====================================deleteById==================================================================");

	//System.out.println(service.deleteById(8));
	
System.out.println("-------------------------------------------------------------------------------------------------------------------------");
System.err.println("===================================deletenamebyid=========================================================================");

System.out.println(service.deleteNameById("Mysore-Tarpaulins", 7));
	
	}
}
