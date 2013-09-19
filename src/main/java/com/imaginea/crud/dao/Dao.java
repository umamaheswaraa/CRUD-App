package com.imaginea.crud.dao;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.List;

import org.hibernate.exception.DataException;
import org.springframework.dao.DataAccessException;

import com.imaginea.crud.entities.Entity;

public interface Dao<E extends Entity, K extends Serializable> {

	public <E extends Entity, obj extends Object> List<E> getEntities(Class<E> inElementClass, String queryName)throws DataAccessException;
	public <E extends Entity, obj extends Object> E getEntity(Class<E> inElementClass, String queryName, Hashtable<String, obj> criteria) throws DataAccessException;
	public Long save(E inEntity) throws DataAccessException ;
	public <E extends Entity> E update(E inEntity) throws DataAccessException;
	public <E extends Entity> E find(Class<E> inElementClass, Long pkey) throws DataException;
}
