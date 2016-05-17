package com.ge.dth;

import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ge.dth.data.Employee;
import com.ge.dth.data.EmployeeDao;

@RestController
public class EmployeeRESTfulService {

	@Autowired	
	EmployeeDao dao;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
    private String test(HttpServletResponse response) {        
		System.out.println("test() called w. HTTP.GET");
		return "test() called w. HTTP.GET";
    }
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
    private Employee[] getEmployee(HttpServletResponse response) {        
		System.out.println("FindAll called for employee");
		ArrayList<Employee> dataSetList =  (ArrayList<Employee>) dao.findAll();
		Employee[] dataSets = dataSetList.toArray(new Employee[dataSetList.size()]);
		System.out.println("FindAll found " + dataSetList.size() + "objects");
		return dataSets;
	}
}
