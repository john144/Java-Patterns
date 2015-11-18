package BuilderPackage;

public class Vehicle {
	private String type;
	private String make;
	private String model;
	private String color;
	private int doors;
	private int price;
	private int horsepower;
	
	public static class Builder {
		private String type;
		private String make;
		private String model;
		private String color;
		private int doors;
		private int price;
		private int horsepower;
		
		public Builder type(String value) {this.type = value; return this;}
		public Builder make(String value) {this.make = value; return this;}
		public Builder model(String value) {this.model = value; return this;}
		public Builder color(String value) {this.color = value; return this;}
		public Builder doors(int value) {this.doors = value; return this;}
		public Builder price(int value) {this.price = value; return this;}
		public Builder horsepower(int value) {this.horsepower = value; return this;}

		  //return fully build object
        public Vehicle build() {
            return new Vehicle(this);
        }		
	}

	private Vehicle (Builder builder) {
		this.type = builder.type;
		this.make = builder.make;
		this.model = builder.model;
		this.color = builder.color;
		this.doors = builder.doors;
		this.price = builder.price;
		this.horsepower = builder.horsepower;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", make=" + make + ", model=" + model
				+ ", color=" + color + ", doors=" + doors + ", price=" + price
				+ ", horsepower=" + horsepower + "]";
	}
	
	
}
