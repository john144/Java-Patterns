package hr;

import data.IObserver;

public class HRDepartment implements IObserver {

	public void callMe(String message) {
		System.out.println("HRDepartment received callMe: " + message);
	}

}
