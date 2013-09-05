package com.imaginea.crud.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.imaginea.crud.entities.Employee;
import com.imaginea.crud.service.IEmployeeService;

@Controller
@RequestMapping("emp")
public class EmployeeController {
	
	IEmployeeService employeeService;

	public IEmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping(value="/fetchEmpAll", method=RequestMethod.GET)
	public ModelAndView fetchAllEmployees(){
		ModelAndView view = new ModelAndView("jsp/employeeInfo");
		
		List<Employee> list =  employeeService.fetchAllEmployees();
		view.addObject("data", list);
		
		
		return view;		
	}

}
