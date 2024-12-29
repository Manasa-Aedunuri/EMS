package com.learnclearly.ems.service;

import java.util.List;
import com.learnclearly.ems.dto.Employee;
import com.learnclearly.ems.exceptions.EmployeeNotFoundException;
import com.learnclearly.ems.dao.IEmployeeDAO;
import com.learnclearly.ems.dao.EmployeeDAOMySqlImpl;

public class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDAO empDao = new EmployeeDAOMySqlImpl();
	
	@Override
	public void addEmployee(Employee e) {
		empDao.addEmployee(e);
	}

	@Override
	public void deleteEmployee(int empid) {
		empDao.deleteEmployee(empid);
	}

	@Override
	public void updateEmpolyee(Employee e) {
		empDao.updateEmpolyee(e);
	}

	@Override
	public Employee findEmployee(Employee e) throws EmployeeNotFoundException {
		return empDao.findEmployee(e);
	}

	@Override
	public List<Employee> showAllEmployees() {
		return empDao.showAllEmployees();
	}

}
