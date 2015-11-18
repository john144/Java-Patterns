package Components;

public class Person {

	public static void main(String[] args) {
		
		Projector proj = new Projector();
		TV tv = new TV();
		SurroundSound ss = new SurroundSound();
		
		RemoteControl.chooseDevice(proj);
		cycleDevice();
		
		RemoteControl.chooseDevice(tv);
		cycleDevice();
		
		RemoteControl.chooseDevice(ss);
		cycleDevice();
	}

	private static void cycleDevice() {
		RemoteControl.turnOn();
		RemoteControl.turnOff();
	}

}
