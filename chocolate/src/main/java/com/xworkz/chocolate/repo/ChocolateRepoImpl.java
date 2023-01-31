package com.xworkz.chocolate.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.chocolate.dto.ChocolateDto;

public class ChocolateRepoImpl implements ChocolateRepo {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("chocolate-data");
EntityManager em = emf.createEntityManager();


	public boolean saveAll(ChocolateDto dto) {

		if(em!=null)
		{
			em.getTransaction().begin();
			em.persist(dto);
		    em.getTransaction().commit();
		    return true;
		
		}
		return false;
	}


	public List<ChocolateDto> readAll() {
		if(em!=null)
		{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readAll",ChocolateDto.class);
		    em.getTransaction().commit();
		    return query.getResultList();
		
		}
		
		return null;
	}


	public ChocolateDto findByColorAndWeight(String color, String weight) {
		if(em!=null)
		{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findbycolorandweight",ChocolateDto.class);
			query.setParameter("cl",color);
			query.setParameter("we",weight);
			
		    em.getTransaction().commit();
		    return (ChocolateDto) query.getSingleResult();
		
		}
		
		
		return null;
	}


	public ChocolateDto findByPriceAndName(int price, String name) {
		if(em!=null)
		{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findbypriceandname",ChocolateDto.class);
			query.setParameter("pr",price);
			query.setParameter("nm",name);
			
		    em.getTransaction().commit();
		    return (ChocolateDto) query.getSingleResult();
		
		}
		
		
		return null;
	}


	public boolean updateWeightByNameAndColor(String weight, String name, String color) {
		if(em!=null)
		{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateweightbynameandcolor");
			query.setParameter("we",weight);
			query.setParameter("nm",name);
			query.setParameter("cl",color);
			query.executeUpdate();
			
		    em.getTransaction().commit();

		    return true;
		}
		
		
		return false;
	}


	public boolean updateWeightByNameAndColor(String name, int id, String weight) {

		if(em!=null)
		{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updatenamebyidandweight");
			query.setParameter("nm",name);
			query.setParameter("id",id);
			query.setParameter("we",weight);
			query.executeUpdate();
			
		    em.getTransaction().commit();

		    return true;
	
	}
		
		return false;
	}


	public boolean deleteBycolorAndName(String color, String name) {

		if(em!=null)
		{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deletebycolorandname");
			query.setParameter("cl",color);
			query.setParameter("nm",name);
			query.executeUpdate();
			
		    em.getTransaction().commit();

		    return true;
	
		}	
		
		return false;
	}

}
