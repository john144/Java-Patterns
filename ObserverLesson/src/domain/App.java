package domain;

import hr.HRDepartment;

import java.util.Date;

import payroll.PayrollDepartment;
import data.Employee;
import data.EmployeeDAO;
import data.EmployeeManagementSystem;
import data.IObserver;

public class App {

	public static void main(String[] args) {
		IObserver payroll = new PayrollDepartment();
		IObserver hr = new HRDepartment();
		EmployeeDAO dao = new EmployeeDAO();
		dao.generateEmployees();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem(dao);
		ems.registerObserver(payroll);
		ems.registerObserver(hr);
		
		ems.hireEmployee(new Employee("Wally", new Date(), 900, true));
		ems.modifyEmployee(5, "Bill");
		ems.listAllEmployees();
	}

}
