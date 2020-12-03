package com.org_25_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String... strings) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		EmployeeDao employee1 = new EmployeeDao("Sumukh", 1, 22000.0);
		EmployeeDao employee2 = new EmployeeDao("Sai", 2, 22000.0);
		EmployeeDao employee3 = new EmployeeDao("Shamy", 3, 22000.0);
		EmployeeDao employee4 = new EmployeeDao("Tharun", 4, 26000.0);
		EmployeeDao employee5 = new EmployeeDao("Vishnu", 5, 26000.0);
		EmployeeServiceImpl service = (EmployeeServiceImpl) context.getBean("employeeServiceImpl");
		service.storeEmployee(employee1);
		service.storeEmployee(employee2);
		service.storeEmployee(employee3);
		service.storeEmployee(employee4);
		service.storeEmployee(employee5);

		service.findEmployeeById(2);
		service.displayAllEmplpoyees();

	}

}
