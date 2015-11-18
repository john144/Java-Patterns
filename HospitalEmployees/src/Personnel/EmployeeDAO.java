package Personnel;

public class EmployeeDAO {

	private DataConnectionManager mgr = null;
	
	public EmployeeDAO(DataConnectionManager dataConnectionManager) {
		this.mgr = dataConnectionManager;
	}

	public void saveEmployee(Employee employee) {
		System.out.println("save employee " + employee);
		
	}

	public void deleteEmployee(Employee employee) {
		System.out.println("delete employee " + employee);
		
	}

}
