package com.org_25_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repo;

	public void storeEmployee(EmployeeDao dao) {

		repo.store(dao);

	}

	public void findEmployeeById(Integer id) {

		System.out.println(repo.findEmployeeById(id));

	}

	public void displayAllEmplpoyees() {

		System.out.println(repo.displayAllEmployees());
}
}
