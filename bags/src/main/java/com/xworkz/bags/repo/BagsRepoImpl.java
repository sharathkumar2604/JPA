package com.xworkz.bags.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.mapping.Bag;

import com.xworkz.bags.dto.BagsDto;

public class BagsRepoImpl implements BagsRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();
	
	
	
	public boolean saveAll(BagsDto dto) {
if(em!=null)
{
	em.getTransaction().begin();
	em.persist(dto);
	em.getTransaction().commit();
	return true;
	
}
		
		return false;
	}



	public List<BagsDto> readAll() {
if(em!=null)
{
	em.getTransaction().begin();
	Query query = em.createNamedQuery("readAll", BagsDto.class);
	em.getTransaction().commit();
	return query.getResultList();
}
		
		
		return null;
	}



	public BagsDto findById(int id) {
if(em!=null)
{
	em.getTransaction().begin();
	BagsDto find = em.find(BagsDto.class,id);
	em.getTransaction().commit();

	return find;
}
return null;
		
	}	
	
	


	public BagsDto findNameById(String name,int id)
	{
		if(em!=null)
		{
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findnamebyid",BagsDto.class);
			query.setParameter("nm", name);
			query.setParameter("id", id);
			em.getTransaction().commit();
			return (BagsDto) query.getSingleResult();
			

		
	
	}
		return null;
}



	public boolean updateNameById(String name, int id) {
		if(em!=null)
		{
			em.getTransaction().begin();
			BagsDto find = em.find(BagsDto.class,id);
			find.setName(name);
			em.merge(find);
		
			em.getTransaction().commit();
			
			return true;
			
	           

		
	}
		return false;
	}



	public boolean updateNameByIdAndColor(String name, int id, String color) {
if(em!=null)
{
	em.getTransaction().begin();
	Query query = em.createNamedQuery("updatenamebyidandcolor");
    query.setParameter("nm",name);
    query.setParameter("id",id);
    query.setParameter("cl",color);
    query.executeUpdate();
    em.getTransaction().commit();
    
    return true;
}
return false;
		
		
	}



	public boolean deleteById(int id) {
if(em!=null)
{
	em.getTransaction().begin();
	BagsDto find = em.find(BagsDto.class,id);
em.remove(find);

em.getTransaction().commit();

	return true;
	
}
		
		return false;
	}



	public boolean deleteNameById(String name, int id) {
if(em!=null)
{
	em.getTransaction().begin();
	 Query query = em.createNamedQuery("deletenamebyid");
	query.setParameter("nm", name);
	query.setParameter("id", id);

	query.executeUpdate();
	return true;
}
		
		return false;
	}
	
	
	}