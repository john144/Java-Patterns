package Personnel;

public class ReportFormatter {
	private String formattedValue;

	public String getFormattedValue() {
		return formattedValue;
	}
	
	protected void convertObjectToXML(Object object) {
		formattedValue = "XML: " + object.toString();
	}
	
	protected void convertObjectToCSV(Object object) {
		formattedValue = "CSV: " + object.toString();
	}
}
