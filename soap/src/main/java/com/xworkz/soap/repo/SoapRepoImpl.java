package com.xworkz.soap.repo;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.soap.dto.SoapDto;

public class SoapRepoImpl implements SoapRepo {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("soap-data");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean create(SoapDto dto) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return true;

		}

		return false;
	}

	public List<SoapDto> readAll() {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query query = entityManager.createNamedQuery("readall", SoapDto.class);
			entityManager.getTransaction().commit();

			return query.getResultList();

		}

		return null;
	}

	public SoapDto findById(int id) {

		if (entityManager != null) {
			entityManager.getTransaction().begin();
			SoapDto FindDto = entityManager.find(SoapDto.class, id);
			entityManager.getTransaction().commit();
			return FindDto;
		}

		return null;
	}

	public SoapDto findByName(String name) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query query = entityManager.createNamedQuery("findByName", SoapDto.class);

			query.setParameter("nm", name);
			entityManager.getTransaction().commit();
			return (SoapDto) query.getSingleResult();

		}
		return null;
	}

	public SoapDto findByColor(String color) {

		if(entityManager!=null)
		{
			entityManager.getTransaction().begin();
			Query query = entityManager.createNamedQuery("findByColor",SoapDto.class);
			query.setParameter("cl", color);
			entityManager.getTransaction().commit();
			return (SoapDto) query.getSingleResult();
			
		}
		
		return null;
	}
}