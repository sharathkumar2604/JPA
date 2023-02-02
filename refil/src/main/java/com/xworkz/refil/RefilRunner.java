package com.xworkz.refil;

import java.util.Arrays;
import java.util.List;

import com.xworkz.refil.dto.RefilDto;
import com.xworkz.refil.service.RefilService;
import com.xworkz.refil.service.RefilServiceImpl;

public class RefilRunner {

	public static void main(String[] args) {

		RefilService service = new RefilServiceImpl();
		
		RefilDto dto1 = new RefilDto(1,"cello","blue", 10,"ball");
		RefilDto dto2 = new RefilDto(2,"reynolds","black", 12,"gel");
		RefilDto dto3 = new RefilDto(3,"nataraja","red", 8,"ball");
		RefilDto dto4 = new RefilDto(4,"brite","green", 9,"ball");
		RefilDto dto5 = new RefilDto(5,"doms","blue", 10,"ball");
		
//		List<RefilDto> li = Arrays.asList(dto1,dto2,dto3,dto4,dto5);
//		
//		service.saveAll(li);
//		
		
//		for (RefilDto read : service.readAll()) {
//			System.out.println(read);
//		}
		
//		System.out.println(service.findById(3));
		
		System.out.println(service.findNameByIdAndColor("brite", 4,"green"));
	
		
	}

}
