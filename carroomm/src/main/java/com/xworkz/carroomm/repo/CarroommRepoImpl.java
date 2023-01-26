package com.xworkz.carroomm.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.carroomm.dto.CarroommDto;

public class CarroommRepoImpl implements CarroommRepo {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("carromTest");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean save(CarroommDto dto) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return true;
		}
		return false;

	}

	public CarroommDto findNameById(int id) {

		if (entityManager != null) {
			entityManager.getTransaction().begin();
		CarroommDto dto =entityManager.find(CarroommDto.class,id);
			entityManager.getTransaction().commit();
		 return dto;
		}
		
		return null;
	}

	public boolean updateNameById(String name, int id) {
 
		if (entityManager != null) {
			entityManager.getTransaction().begin();
		CarroommDto dto =entityManager.find(CarroommDto.class,id);
		   dto.setName(name);
		   entityManager.merge(dto);
		entityManager.getTransaction().commit();
		return true;
		 
		}
		
		
		return false;
	}

	public boolean deleteById(int id) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
		CarroommDto dto =entityManager.find(CarroommDto.class,id);
		   entityManager.remove(dto);
		entityManager.getTransaction().commit();
		return true;
	}
		return false;

	}}
