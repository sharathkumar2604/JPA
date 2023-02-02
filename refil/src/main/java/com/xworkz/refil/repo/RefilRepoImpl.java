package com.xworkz.refil.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.refil.dto.RefilDto;

public class RefilRepoImpl implements RefilRepo {
EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("refiltoPersistance");
EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean saveAll(RefilDto dto) {
if(entityManager!=null)
{
	entityManager.getTransaction().begin();
	entityManager.persist(dto);
	entityManager.getTransaction().commit();
	return true;
}
		
		return false;
	}

	public List<RefilDto> readAll() {
		if(entityManager!=null)
		{
			entityManager.getTransaction().begin();
		Query query = entityManager.createNamedQuery("readAll",RefilDto.class);
			
			entityManager.getTransaction().commit();
			return query.getResultList();
		
	}
		return null;

	}

	public RefilDto findById(int id) {
if(entityManager!=null)
{
	entityManager.getTransaction().begin();
	RefilDto find = entityManager.find(RefilDto.class, id);
	entityManager.getTransaction().commit();
	return find;
	
}
		
		return null;
	}

	public RefilDto findNameByIdAndColor(String name, int id, String color) {
		if(entityManager!=null)
		{
			entityManager.getTransaction().begin();
		Query query = entityManager.createNamedQuery("findnamebyidandcolor",RefilDto.class);
			query.setParameter("nm", name);
			query.setParameter("id", id);
			query.setParameter("cl", color);
			
			entityManager.getTransaction().commit();
			return (RefilDto) query.getSingleResult();
		
		
	}
		return null;
	}
	}