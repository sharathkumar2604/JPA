package com.xworkz.biscuit;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.biscuit.Dto.BiscuitDto;

public class BiscuitRunner {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		BiscuitDto dto1 = new BiscuitDto(1,"Parle-G",5,"Human",true);
		BiscuitDto dto2 = new BiscuitDto(2,"Marie-Gold",10,"Human",false);
		BiscuitDto dto3 = new BiscuitDto(3,"Hide&Seek",15,"Human",false);
		BiscuitDto dto4 = new BiscuitDto(4,"MilkBisk",20,"Human",true);
		BiscuitDto dto5 = new BiscuitDto(5,"Dark-Fantasy",10,"Human",true);
		BiscuitDto dto6=  new BiscuitDto(6,"Pedigree",50,"Dog",false);
		BiscuitDto dto7 = new BiscuitDto(7,"Drools",25,"Dog",false);
		BiscuitDto dto8 = new BiscuitDto(8,"Moms_Magic",20,"Human",true);
		BiscuitDto dto9 = new BiscuitDto(9,"Good-day",12,"Human",true);
		BiscuitDto dto10 = new BiscuitDto(10,"Burbon",22,"Human",true);
		
		entityManager.persist(dto1);
	    entityManager.persist(dto2);
		entityManager.persist(dto3);
		entityManager.persist(dto4);
		entityManager.persist(dto5);
		entityManager.persist(dto6);
		entityManager.persist(dto7);
		entityManager.persist(dto8);
		entityManager.persist(dto9);
		entityManager.persist(dto10);
		
		 
//		BiscuitDto del = entityManager.find(BiscuitDto.class, 10);
////		System.out.println(del);
//		
//		
////		dto3.setName("BarkOut");
////		entityManager.merge(dto3);
////		
//	entityManager.remove(del);

		entityManager.getTransaction().commit();
		
		
	}

}
