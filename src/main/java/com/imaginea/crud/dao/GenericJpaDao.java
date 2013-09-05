package com.imaginea.crud.dao;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;

import com.imaginea.crud.entities.IEntity;

public class GenericJpaDao<E extends IEntity, K extends Serializable> implements IDao<E, K> {
	
	private EntityManager entityManager;

	@PersistenceContext
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public <E extends IEntity, obj> List<E> getEntities(
			Class<E> inElementClass, String queryName) throws DataAccessException {
		Object result =null;
		try{
			Query qry = entityManager.createNamedQuery(queryName);
			result = qry.getResultList();
			
		}catch (Exception e) {
			
		}
		return (List<E>) result;
	}

	public <E extends IEntity, obj> E getEntity(Class<E> inElementClass,
			String queryName, Hashtable<String, obj> criteria)
			throws DataAccessException {
		Object result=null;
		String key;
		try{
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
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return (E) result;
	}

	

}
