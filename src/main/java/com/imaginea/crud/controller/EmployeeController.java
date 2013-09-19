package com.imaginea.crud.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.imaginea.crud.entities.Employee;
import com.imaginea.crud.service.EmployeeService;

@Controller
@RequestMapping("emp")
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	EmployeeService employeeService;


	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping(value="/fetchEmpAll", method=RequestMethod.GET)
	public ModelAndView fetchAllEmployees(){
		ModelAndView view = new ModelAndView("jsp/employeeInfo");
		int datasize=0;
		List<Employee> employees=null;
		try {
			employees = employeeService.fetchAllEmployees();
			if(employees!=null && employees.size()>0)
			{
				datasize=employees.size();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		view.addObject("data", employees);
		view.addObject("datasize", datasize);
		
		return view;		
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody String creatEmployee(@RequestParam("firstName") String firstName, 
			@RequestParam("lastName") String lastName, @RequestParam("phone") String phone, 
			@RequestParam("email") String email){
		String result=null;
			try{
				
				Employee emp = employeeService.setEmployee(firstName, lastName, phone, email);
				employeeService.save(emp);
				result = "success";
			}catch (Exception e) {
				e.printStackTrace();
				logger.error("#### Emplopyee creation failed " + e.getMessage());
				result="failure";
			}
			return result;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public @ResponseBody String updateEmployee(@RequestParam("employeeId") String pkey, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("phone") String phone, @RequestParam("email") String email){

		String result=null;
		try{
			logger.info("pkey :"+pkey);
			employeeService.update(pkey, firstName,lastName,phone,email);
			result = "success";
		}catch (Exception e) {
			logger.error("#### Emplopyee creation failed " + e.getMessage());
			result="failure";
		}			
		return result;
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public @ResponseBody String deleteEmployee(@RequestParam("employeeId") String pkey){
		String result=null;
		try{
			employeeService.delete(pkey);
			result = "success";
		}catch (Exception e) {
			logger.error("#### Emplopyee creation failed " + e.getMessage());
			result = "failure";
			
		}
		return result;
	}

}
