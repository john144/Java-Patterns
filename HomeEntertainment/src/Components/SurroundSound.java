package Components;

public class SurroundSound extends Device {

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
		return "SurroundSound [state=" + state + "]";
	}

}
