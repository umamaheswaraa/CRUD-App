package com.imaginea.crud.service;

import java.util.List;

import com.imaginea.crud.dao.IDao;
import com.imaginea.crud.entities.Employee;
import com.imaginea.crud.entities.IEntity;

public class EmployeeServiceImpl implements IEmployeeService {

	IDao<IEntity, Long> genericDao;

	public IDao<IEntity, Long> getGenericDao() {
		return genericDao;
	}

	public void setGenericDao(IDao<IEntity, Long> genericDao) {
		this.genericDao = genericDao;
	}

	public List<Employee> fetchAllEmployees() {
		List<Employee> result=null;
		try{
			
		 result = genericDao.getEntities(Employee.class, "empoyee.all");
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}
	
	
	
}
