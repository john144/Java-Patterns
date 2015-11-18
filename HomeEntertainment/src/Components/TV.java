package Components;

public class TV extends Device {
	@Override
	public void turnOn() {
		state = true;
	}

	@Override
	public void turnOff() {
		state = false;
	}

	@Override
	public String toString() {
		return "TV [state=" + state + "]";
	}
}
