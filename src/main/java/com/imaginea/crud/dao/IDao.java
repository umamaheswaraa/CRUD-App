package com.imaginea.crud.dao;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.imaginea.crud.entities.IEntity;

public interface IDao<E extends IEntity, K extends Serializable> {

	<E extends IEntity, obj extends Object> List<E> getEntities(Class<E> inElementClass, String queryName)throws DataAccessException;
	<E extends IEntity, obj extends Object> E getEntity(Class<E> inElementClass, String queryName, Hashtable<String, obj> criteria) throws DataAccessException;
}
