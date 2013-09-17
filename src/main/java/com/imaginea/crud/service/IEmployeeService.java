package com.imaginea.crud.service;

import java.util.List;

import com.imaginea.crud.entities.Employee;
import com.imaginea.crud.exception.CRUDException;

public interface IEmployeeService {

	public List<Employee> fetchAllEmployees()throws CRUDException;
	public Employee setEmployee(String firstName, String lastName, String phone, String email);
	public Long save(Employee emp) throws CRUDException;
	public void update(String pkey,String firstName,String lastName,String phone, String email) throws CRUDException;
	public void delete(String pkey) throws CRUDException;

}
