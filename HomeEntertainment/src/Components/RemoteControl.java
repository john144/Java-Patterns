package Components;

public class RemoteControl {
	private static Device device = null;
	
	public static void chooseDevice(Device device1) {
		device = device1;
	}
	
	public static void turnOn() {
		device.turnOn();
		device.showState();
	}
	
	public static void turnOff() {
		device.turnOff();
		device.showState();
	}
}
