package payroll;

import data.IObserver;

public class PayrollDepartment implements IObserver {

	public void callMe(String message) {
		System.out.println("PayrollDepartment received callMe: " + message);
	}

}
