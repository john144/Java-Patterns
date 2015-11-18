package Components;

public class Projector extends Device {

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
		return "Projector [state=" + state + "]";
	}

}
