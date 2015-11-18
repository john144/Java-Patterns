package data;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
	private EmployeeDAO dao = null;
	private Employee emp = null;
	private List<IObserver> observerList = new ArrayList<IObserver>();
	
	public EmployeeManagementSystem(EmployeeDAO dao) {
		this.dao = dao;
	}
	
	public void registerObserver(IObserver department) {
		observerList.add(department);
	}
	
	public void notifyAllDepartments(String message) {
		for (IObserver dept : observerList) {
			dept.callMe(message);
		}
	}
	
	public void hireEmployee(Employee employee) {
		this.emp = employee;
		dao.addEmployee(employee);
		notifyAllDepartments("Hired " + employee.getName() + " ID: " + employee.getEmployeeID());
	}
	
	public void modifyEmployee(int id, String name) {
		dao.modifyEmployee(id, name);
		notifyAllDepartments("Modified " + name + " ID: " + id);
	}

	public void listAllEmployees() {
		for (Employee emp : dao.getEmployees()) {
			System.out.println(emp);
		}
	}
}
