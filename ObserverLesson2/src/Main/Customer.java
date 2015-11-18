package Main;

public class Customer implements IWaitingCustomer {
	private String name;
	private String drinkOrdered;
	
	
	public Customer(String name, String drinkOrdered) {
		super();
		this.name = name;
		this.drinkOrdered = drinkOrdered;
	}
	
	public String toString() {
		return "Customer [name=" + name + ", drinkOrdered=" + drinkOrdered
				+ "]";
	}

	public void OrderReady(String preparedDrink) {
		System.out.println("Order Ready for " + getName() + " " + preparedDrink);
	}

	public String DrinkOrdered() {
		return getDrinkOrdered();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDrinkOrdered() {
		return drinkOrdered;
	}

	public void setDrinkOrdered(String drinkOrdered) {
		this.drinkOrdered = drinkOrdered;
	}

}
