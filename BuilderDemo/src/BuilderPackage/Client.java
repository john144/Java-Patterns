package BuilderPackage;

public class Client {

	public static void main(String[] args) {
		Vehicle car = new Vehicle.Builder()
		.color("red")
		.doors(4)
		.horsepower(200)
		.make("Honda")
		.model("Accord")
		.price(15000)
		.type("car")
		.build();
		
		System.out.println(car);
	}

}
