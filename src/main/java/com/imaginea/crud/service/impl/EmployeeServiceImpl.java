package com.imaginea.crud.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.imaginea.crud.dao.Dao;
import com.imaginea.crud.entities.Employee;
import com.imaginea.crud.entities.Entity;
import com.imaginea.crud.exception.CRUDException;
import com.imaginea.crud.service.EmployeeService;
import com.imaginea.crud.utils.Constants;
import com.imaginea.crud.utils.CrudUtil;

/**
 * @author umamaheswaraa
 *
 */
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	
	Dao<Entity, Long> genericDao;

	public Dao<Entity, Long> getGenericDao() {
		return genericDao;
	}

	public void setGenericDao(Dao<Entity, Long> genericDao) {
		this.genericDao = genericDao;
	}

	/**
	 * This method will fetch the list of employee records
	 * @return employees
	 * @throws CRUDException
	 *
	 */
	public List<Employee> fetchAllEmployees() throws CRUDException {
		List<Employee> employees=null;
		try{			
			employees = genericDao.getEntities(Employee.class, "empoyee.all");
		}catch (Exception e) {
			e.printStackTrace();
			throw new CRUDException("Exception while fetching All Employees :"+e.getMessage());
		}
		
		return employees;
	}
	
	/**
	 * This method will set values for employee object
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param email
	 * @return employee
	 *
	 */
	public Employee setEmployee(String firstName, String lastName, String phone, String email)
	{
		Date today = CrudUtil.getCurrentTime();
		
		Employee emp = new Employee();
		
		emp.setFirstName(firstName);
		emp.setLastName(lastName);				
		emp.setEmail(email);
		emp.setAge(0);
		emp.setCreatedOn(today);
		emp.setChangedOn(today);
		emp.setChangedBy(Constants.DEFAULT_USER);
		emp.setCreatedBy(Constants.DEFAULT_USER);

		if(emp.getIsDeleted() == null){
			emp.setIsDeleted(false);
		}
		if(phone!=null){
			emp.setPhone(new Long(phone));
		}else{
			emp.setPhone(new Long(Constants.DEFAULT_PHONE));
		}
		return emp;
	}

	/**
	 * This method will save the employee record
	 * @param emp
	 * @return pkey
	 * @throws CRUDException
	 *
	 */
	@Transactional
	public Long save(Employee emp) throws CRUDException{
		Long pkey=null;
		try{
			logger.info("Emp Values "+emp.getFirstName());
			pkey = genericDao.save(emp);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception while saving the data"+e.getMessage());
			throw new CRUDException("Exception while saving Employee Data :"+e.getMessage());
		}
		return pkey;
	}
	
	/**
	 * This method will update the employee record
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param email
	 * @throws CRUDException
	 *
	 */
	@Transactional
	public void update(String pkey,String firstName,String lastName,String phone, String email) throws CRUDException {
		try{
			Long lPhone=new Long(Constants.DEFAULT_PHONE);
			Long employeeId = new Long(pkey);
			Employee emp = genericDao.find(Employee.class,employeeId);
			Date today = CrudUtil.getCurrentTime();
			emp.setChangedOn(today);
			emp.setFirstName(firstName);
			emp.setLastName(lastName);
			emp.setEmail(email);
			if(phone!=null){
				lPhone = new Long(phone);
			}
			emp.setPhone(lPhone);
			
			genericDao.update(emp);
		}catch (Exception e) {
			logger.error("Exception while updating the Data"+e.getMessage());
			throw new CRUDException("Exception while updating Employee Data :"+e.getMessage());
		}
	}
	
	/**
	 * This method will delete the employee record
	 * @param pkey
	 * @throws CRUDException
	 *
	 */
	@Transactional
	public void delete(String pkey) throws CRUDException {
		try{
			Long employeeId = new Long(pkey);
			Employee emp = genericDao.find(Employee.class,employeeId);
			
			Date today = CrudUtil.getCurrentTime();
			emp.setChangedOn(today);
			emp.setIsDeleted(true);
			genericDao.update(emp);
		}catch (Exception e) {
			logger.error("Exception while deleting the Data"+e.getMessage());
			throw new CRUDException("Exception while Deleting Employee Data :"+e.getMessage());
		}
	}
	
	
}
