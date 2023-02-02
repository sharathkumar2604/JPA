package com.xworkz.pen;

import com.xworkz.pen.dto.PenDto;
import com.xworkz.pen.service.PenService;
import com.xworkz.pen.service.PenServiceImpl;

public class PenRunner {

	public static void main(String[] args) {

		PenService service = new PenServiceImpl();

		PenDto dto1 = new PenDto(1, "cello","blue", 5,"ballpen");
		PenDto dto2 = new PenDto(2, "cello1","black", 10,"inkpen");
		PenDto dto3 = new PenDto(3, "cello2","blue", 15,"gelpen");
		PenDto dto4 = new PenDto(4, "cello3","brown", 25,"normalpen");
		PenDto dto5= new PenDto(5, "cello4","red", 35,"fountainpen");
		PenDto dto6 = new PenDto(6, "cello5","green", 45,"pointpen");
		PenDto dto7 = new PenDto(7, "cello6","pink", 55,"sketchpen");
		
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
//		service.save(dto6);
//		service.save(dto7);
		
		
		for (PenDto string : service.readAll()) {
			System.out.println(string);
			
		}
	}


	
}
