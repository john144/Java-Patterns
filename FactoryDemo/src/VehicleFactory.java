
public class VehicleFactory {
	
	public Vehicle constructVehicleClass(VehicleType type) {
		return type.getVehicle();
	}
}
