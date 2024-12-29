package com.learnclearly.ems.main;

import com.learnclearly.ems.business.ContractEmployeeSalaryCalculator;
import com.learnclearly.ems.business.PermanentEmployeeSalaryCalculator;
import com.learnclearly.ems.dto.Employee;
public class EmployeeSalaryMain {

	public static void main(String[] args) {
		
		PermanentEmployeeSalaryCalculator pe = new PermanentEmployeeSalaryCalculator();
		pe.calculateNetSalary(new Employee(1234, "A", "Clerk", 28), 30000);
		
		ContractEmployeeSalaryCalculator ce = new ContractEmployeeSalaryCalculator();
		ce.calculateNetSalary(new Employee(4321, "B", "Manager", 20), 50000);
	}

}