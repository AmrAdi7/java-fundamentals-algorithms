package programming_paradigm;

public class Mercedes extends Car {
	public Mercedes(String color) {
		super("mercedes", color);
	}

	public void step_forward() {
		if (getEngine().Running()) {
			setPosition(getPosition() - 2);
			System.out.println(getBrand() + getPosition());
		} else {
			System.out.println("Start first");
		}
	}
}
