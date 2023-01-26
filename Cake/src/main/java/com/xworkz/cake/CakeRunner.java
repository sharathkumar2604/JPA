package com.xworkz.cake;

import javax.persistence.EntityManager;

import com.xworkz.cake.dto.CakeDto;
import com.xworkz.cake.service.CakeService;
import com.xworkz.cake.service.CakeServiceImpl;

public class CakeRunner {
	
	public static void main(String[] args) {
		
		CakeService service = new CakeServiceImpl();
		
		
		CakeDto dto = new CakeDto(1,"RedVelvetCake","red", "500gram",800);
		CakeDto dto1 = new CakeDto(2,"ChocolateCake","black", "1000gram",1200);
		CakeDto dto2 = new CakeDto(3,"PistaCake","green", "500gram",600);
		CakeDto dto3 = new CakeDto(4,"VenillaCake","white", "250gram",100);
		CakeDto dto4 = new CakeDto(5,"StrawberryCake","pink", "500gram",300);
		CakeDto dto5 = new CakeDto(6,"VelvetCake","purple", "750gram",800);
		CakeDto dto6 = new CakeDto(7,"FruitsCake","allfruits", "150gram",1800);
		
//	       boolean status = service.save(dto);
//	       service.save(dto1);
//	        service.save(dto2);
//	        service.save(dto3);
//	        service.save(dto4);
//	        service.save(dto5);
//	        service.save(dto6);
	        
	      // System.out.println(status);
	       
	       
	       System.out.println(service.findNameById(3));
	       
	       System.out.println(service.updateNameById("BlackForest",3 ));
	
	       
	       System.out.println(service.deleteNameByID("FruitsCake", 7));
	       
	
	}

}
