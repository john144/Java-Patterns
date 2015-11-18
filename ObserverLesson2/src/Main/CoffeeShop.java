package Main;

public class CoffeeShop {

	public static void main(String[] args) {
		CoffeeAttendant barista = new CoffeeAttendant();
		
		Customer cust1 = new Customer("John",  "latte");
		Customer cust2 = new Customer("Bob",  "mocha");
		Customer cust3 = new Customer("Nancy",  "espresso");
		
		barista.takeOrder(cust1);
		barista.takeOrder(cust2);
		barista.takeOrder(cust3);
		
		barista.dumpQueue();
		barista.prepareDrink("mocha");
		
		barista.takeOrder((IWaitingCustomer) new Customer("Alice", "coffee"));
			
		barista.dumpQueue();
		barista.prepareDrink("latte");
		barista.dumpQueue();
		barista.prepareDrink("coffee");
		barista.dumpQueue();
		barista.prepareDrink("espresso");
		barista.dumpQueue();
	}
}
