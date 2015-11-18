
public enum VehicleType {
	CAR{
		public Vehicle getVehicle() {
			return new Car();
		}
	},
	TRUCK{
		public Vehicle getVehicle() {
			return new Truck();
		}
	},
	BUS{
		public Vehicle getVehicle() {
			return new Bus();
		}
	},
	ELECTRIC_CAR{
		public Vehicle getVehicle() {
			return new ElectricCar();
		}
	};
	
	abstract Vehicle getVehicle();
}
