package Personnel;

public class EmployeeReportFormatter extends ReportFormatter {
	private Employee employee = null;
	private FormatType type = null;
	
	public EmployeeReportFormatter(Employee employee, FormatType type) {
		super();
		this.employee = employee;
		this.type = type;
	}
	
	public String getFormattedEmployee() {
		if (type == FormatType.CSV) {
			convertObjectToCSV(employee.getName());
		} else if (type  == FormatType.XML) {
			convertObjectToXML(employee.getName());
		}
		
		return getFormattedValue();
	}
}
