package com.xworkz.cake.repo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.cake.dto.CakeDto;

public class CakeRepoImpl implements CakeRepo {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cakedtoPersistance");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean save(CakeDto dto) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return true;
		}
		return false;

	}

	public CakeDto findNameById(int id) {

		if (entityManager != null) {
			entityManager.getTransaction().begin();
			CakeDto dto = entityManager.find(CakeDto.class, id);
			entityManager.getTransaction().commit();
			return dto;
		}
		return null;
	}

	

	public boolean updateNameById(String name, int id) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();

			CakeDto dto = entityManager.find(CakeDto.class, id);
			dto.setName(name);
			entityManager.merge(dto);

			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean deleteNameById(String name, int id) {

		if (entityManager != null) {
			entityManager.getTransaction().begin();

			CakeDto dto = entityManager.find(CakeDto.class, id);
			entityManager.remove(dto);

			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

}
