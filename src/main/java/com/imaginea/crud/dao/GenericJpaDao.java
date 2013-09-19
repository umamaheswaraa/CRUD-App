package com.imaginea.crud.dao;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.exception.DataException;
import org.springframework.dao.DataAccessException;

import com.imaginea.crud.entities.Entity;

public class GenericJpaDao<E extends Entity, K extends Serializable> implements Dao<E, K> {
	
	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
	public <E extends Entity, obj> List<E> getEntities(
			Class<E> inElementClass, String queryName) throws DataAccessException {
		Object result =null;
		
		Query qry = entityManager.createNamedQuery(queryName);
		result = qry.getResultList();
		
		return (List<E>) result;
	}

	public <E extends Entity, obj> E getEntity(Class<E> inElementClass,
			String queryName, Hashtable<String, obj> criteria)
			throws DataAccessException {
		Object result=null;
		String key;
		Query qry = entityManager.createNamedQuery(queryName);
		if(criteria!=null)
		{
			Enumeration<String> keys = criteria.keys();
			while(keys.hasMoreElements())
			{
				key = keys.nextElement();
				qry.setParameter(key, criteria.get(key));
			}
		}
		
		result = qry.getSingleResult();
			
		return (E) result;
	}

	public Long save(E inEntity) throws DataAccessException {		
			entityManager.persist(inEntity);
			return (Long) entityManager.getEntityManagerFactory().getPersistenceUnitUtil().getIdentifier(inEntity);
		
	}

	public <E extends Entity> E update(E inEntity) throws DataAccessException {			
			
			return entityManager.merge(inEntity);		
	}	
	
	public <E extends Entity> E find(Class<E> inElementClass, Long pkey) throws DataException{
		
		return entityManager.find(inElementClass, pkey);
	}

}
