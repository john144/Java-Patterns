package Components;

public abstract class Device {
	
	public boolean state;
	public abstract void turnOn();
	
	public abstract void turnOff();
	
	public void showState() {
		System.out.println(this);
	}
}
