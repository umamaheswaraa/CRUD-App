package com.imaginea.crud.service;

import java.util.List;

import com.imaginea.crud.entities.Employee;

public interface IEmployeeService {

	public List<Employee> fetchAllEmployees()throws Exception;
	public Employee setEmployee(String firstName, String lastName, String phone, String email);
	public Long save(Employee emp) throws Exception;
	public void update(String pkey,String firstName,String lastName,String phone, String email) throws Exception;
	public void delete(String pkey) throws Exception;

}
