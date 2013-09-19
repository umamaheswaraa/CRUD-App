package com.imaginea.crud.testcase;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.imaginea.crud.entities.Employee;
import com.imaginea.crud.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class EmployeeServiceTest {
	
	private static Logger logger = LoggerFactory.getLogger(EmployeeServiceTest.class);
	@Autowired
	EmployeeService employeeService;

	@Test
	public void fetchAllEmployees()
	{
		try{
			List<Employee> result = employeeService.fetchAllEmployees();
		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void saveEmployee()
	{
		try{
			Employee emp = employeeService.setEmployee("UMAMAR", "Akasa", "9787826234", "uma@imaginea.com");
			Assert.assertNotNull(emp);
			Long pkey = employeeService.save(emp);
			logger.info("Saved Employee Pkey: "+pkey);
			Assert.assertNotNull(pkey);
			
			
		}catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void saveEmployeeForWrongContact()
	{
		try{
			Employee emp = employeeService.setEmployee("UMAMAR", "Akasa", "3123sdasd", "uma@imaginea.com");
			Long pkey = employeeService.save(emp);
			logger.info("Saved Employee Pkey: "+pkey);
			Assert.assertNotNull(pkey);
			
			
		}catch (Exception e) {
			logger.info("Employee tested with Wrong contact it successfully throwing Exception");
		}
	}
	
	@Test
	public void updateEmployee()
	{
		try{
			Employee emp = employeeService.setEmployee("UMAMAR12", "Akas12", "9787826234", "uma12@imaginea.com");
			Assert.assertNotNull(emp);
			Long pkey = employeeService.save(emp);
			logger.info("Saved Employee Pkey: "+pkey);
			employeeService.update(pkey.toString(), "UMAMAR123", "ak12", "213123213", "aksa@gmail.com");
			
			Assert.assertNotNull(pkey);
			
			
		}catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void deleteEmployee()
	{
		try{
			Employee emp = employeeService.setEmployee("UMAMAR12345", "Akas2", "9787826235", "uma123@imaginea.com");
			Assert.assertNotNull(emp);
			Long pkey = employeeService.save(emp);
			logger.info("Saved Employee Pkey: "+pkey);
			employeeService.delete(pkey.toString());
			
			Assert.assertNotNull(pkey);
		}catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
}
