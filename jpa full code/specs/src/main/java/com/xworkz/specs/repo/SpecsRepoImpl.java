package com.xworkz.specs.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.specs.dto.SpecsDto;

public class SpecsRepoImpl implements SpecsRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("specs-data");
	EntityManager  em = emf.createEntityManager();
	
	public boolean save(SpecsDto dto) {
if(em!=null)
{
	em.getTransaction().begin();
	em.persist(dto);
	em.getTransaction().commit();
	return true;
}
		return false;
	}

	public List<SpecsDto> readAll() {

		if(em!=null)
		{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readAll",SpecsDto.class);
			em.getTransaction().commit();
			return query.getResultList();
		 
		}
		return null;
	}

	public SpecsDto findById(int id) {
if(em!=null) {
	em.getTransaction().begin();
	SpecsDto find = em.find(SpecsDto.class,id);
	em.getTransaction().commit();
return find;
}
		
		
		return null;
	}

	public SpecsDto findByTypeAndPrice(String type, int price) {
if(em!=null)
{
	em.getTransaction().begin();
	Query query = em.createNamedQuery("findByTypeAndPrice", SpecsDto.class);
	query.setParameter("ty", type);
	query.setParameter("pr", price);
	em.getTransaction().commit();
	return (SpecsDto) query.getSingleResult();
	
}
		
		return null;
	}

	public SpecsDto findByName(String name) {
   
		if(em!=null)
		{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByName", SpecsDto.class);
			query.setParameter("nm",name);
			
			em.getTransaction().commit();
			return (SpecsDto) query.getSingleResult();
		}	
		
		return null;
	}

	public boolean updatePriceByName(int price, String name) {
if(em!=null)
{
	em.getTransaction().begin();
	Query query = em.createNamedQuery("updatePriceByName");
	query.setParameter("pr",price);
	query.setParameter("nm",name);
	query.executeUpdate();
	
	em.getTransaction().commit();
	return true;
	
}	
	                 

		
		
		return false;
	}

	public boolean updateColorByPriceAndType(String color, int price, String type) {
		if(em!=null)
		{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateColorByPriceAndType");
			query.setParameter("cl",color);
			query.setParameter("pr",price);
			query.setParameter("ty",type);
			
			query.executeUpdate();
			
			em.getTransaction().commit();
			return true;
		}	
		
		return false;
	}

	public boolean deleteByPriceAndColor(int price, String color) {
		if(em!=null)
		{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByPriceAndColor");
			query.setParameter("pr",price);
			query.setParameter("cl",color);
			
			
			query.executeUpdate();
			
			em.getTransaction().commit();
			return true;
		}
		
		return false;
	}

	public boolean deleteByNameAndId(String name, int id) {
		if(em!=null)
		{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByNameAndId");
			query.setParameter("nm",name);
			query.setParameter("id",id);
			
			
			query.executeUpdate();
			
			em.getTransaction().commit();
			return true;
		}
		
		
		return false;
	}

}
