package data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDAO {
	Employee emp1 = new Employee("Joe",  new Date(), 1000, true);
	Employee emp2 = new Employee("Mike",  new Date(), 2000, true);
	Employee emp3 = new Employee("Bob",  new Date(), 1500, true);
	Employee emp4 = new Employee("Dilbert",  new Date(), 3000, true);
	Employee emp5 = new Employee("Alice",  new Date(), 2500, true);
	
	List<Employee> employees;
	
	public List<Employee> generateEmployees() {
		employees = new ArrayList<Employee>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void modifyEmployee(int id, String name) {
		for (Employee emp : employees) {
			if (emp.getEmployeeID() == id) {
				emp.setName(name);
			}
		}
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
}
