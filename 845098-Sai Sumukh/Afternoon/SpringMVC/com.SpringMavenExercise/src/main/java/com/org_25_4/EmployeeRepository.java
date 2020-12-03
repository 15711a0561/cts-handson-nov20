package com.org_25_4;

import java.util.List;

public interface EmployeeRepository {

	void store(EmployeeDao dao);

	EmployeeDao findEmployeeById(Integer id);

	List<EmployeeDao> displayAllEmployees();

}
