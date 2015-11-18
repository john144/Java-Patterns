package Main;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendant {
	List<IWaitingCustomer> queue = new ArrayList<IWaitingCustomer>();
	String drinkToPrepare;
	
	public void takeOrder(IWaitingCustomer customer) {
		queue.add(customer);
	}
	
	public void prepareDrink(String drinkToPrepare) {
		setDrinkToPrepare(drinkToPrepare);
		callOutCompletedOrder();
	}
	
	private void callOutCompletedOrder() {
		for (IWaitingCustomer customer : queue) {
			if (customer.DrinkOrdered() == getDrinkToPrepare()) {
				customer.OrderReady(getDrinkToPrepare());
				deleteCustomer(customer);
				break;
			}
		}
	}
	
	public void deleteCustomer(IWaitingCustomer customer) {
		queue.remove(customer);
	}
	
	public String getDrinkToPrepare() {
		return this.drinkToPrepare;
	}
	
	public void setDrinkToPrepare(String drinkToPrepare) {
		this.drinkToPrepare = drinkToPrepare;
	}
	
	public void dumpQueue() {
		for (IWaitingCustomer customer : queue) {
			System.out.println(customer);
		}
	}
}
