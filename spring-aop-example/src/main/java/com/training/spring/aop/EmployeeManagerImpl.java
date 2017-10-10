package com.training.spring.aop;

public class EmployeeManagerImpl implements EmployeeManager {
	
	public EmployeeDTO getEmployeeById(Integer employeeId) {
		System.out.println("Method getEmployeeById() is called");
		return new EmployeeDTO();
	}
}
