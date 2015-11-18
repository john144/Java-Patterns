package Personnel;

public class ClientModule {
	static EmployeeDAO dao = null;

	public static void main(String[] args) {
		Employee emp = new Employee(123, "Joe Blow", "Janitorial", false);
		dao = new EmployeeDAO(new DataConnectionManager());
		
		hireNewEmployee(emp);
		printEmployeeReport(emp, FormatType.CSV);
		terminateNewEmployee(emp);
		printEmployeeReport(emp, FormatType.XML);
	}
	
	public static void hireNewEmployee(Employee employee) {
		employee.setWorking(true);
		dao.saveEmployee(employee);
	}

	public static void terminateNewEmployee(Employee employee) {
		employee.setWorking(false);
		dao.deleteEmployee(employee);
	}
	
	public static void printEmployeeReport(Employee employee, FormatType type) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, type);
		System.out.println(formatter.getFormattedEmployee()); 
	}

}
