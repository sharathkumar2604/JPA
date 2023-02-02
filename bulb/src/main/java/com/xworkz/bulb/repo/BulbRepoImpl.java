package com.xworkz.bulb.repo;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.bulb.dto.BulbDto;

public class BulbRepoImpl implements BulbRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("bulbtoPersistance");
	EntityManager em = emf.createEntityManager();
	
	public boolean create(BulbDto dto) {
		if(em!=null)
		{
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public List<BulbDto> readAll() {
		if(em!=null)
		{
			em.getTransaction().begin();
	Query query = em.createNamedQuery("readall",BulbDto.class);
	em.getTransaction().commit();
	       
		
	return  query.getResultList();
	}
		return null;

}

	public BulbDto findById(int id) {
		if(em!=null)
		{
			em.getTransaction().begin();
			BulbDto find=em.find(BulbDto.class, id);
			em.getTransaction().commit();
		
		
		
		return find;
	}
		return null;
}

//	public BulbDto findByName(String name) {
//		if(em!=null)
//		{
//			em.getTransaction().begin();
//		Query query = em.createNamedQuery("findByName", BulbDto.class);
//		query.setParameter("nm", name);
//		em.getTransaction().commit();
//		return (BulbDto) query.getSingleResult();
//		
//		
//		
//		
//	}
//		return null;
//}
	
	public List<BulbDto> findByName(String name) {
		if(em!=null)
		{
			em.getTransaction().begin();
		Query query = em.createNamedQuery("findByName", BulbDto.class);
		query.setParameter("nm", name);
		em.getTransaction().commit();
		return query.getResultList();
		
		
		
		
	}
		return null;
}
}