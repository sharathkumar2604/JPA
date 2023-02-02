package com.xworkz.mobiles.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.mobiles.dto.MobileDto;

public class MobileRepoImpl implements MobileRepo{
EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobilePersistance");
EntityManager entityManager = entityManagerFactory.createEntityManager();	
	public boolean save(MobileDto dto) {
		if(entityManager!=null)
		{
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
            entityManager.getTransaction().commit();
            return true;
            
		}

		return false;
	}

}
