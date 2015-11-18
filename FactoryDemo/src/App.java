

public class App {

	public static void main(String[] args) {
		VehicleFactory factory = new VehicleFactory();
		Vehicle vehicle = factory.constructVehicleClass(VehicleType.ELECTRIC_CAR);
		vehicle.startEngine();
	}

}
