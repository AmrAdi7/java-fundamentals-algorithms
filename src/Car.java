package programming_paradigm;

public class Car extends Engine {

	private String color;
	private String brand;
	private int position = 0;
	private Engine engine;

	Car(String brand, String color) {
		this.brand = brand;
		this.color = color;
		this.engine = new Engine();
	}

	public void step_forward() {
		if (getEngine().Running()) {
			setPosition(getPosition() + 1);
			System.out.println(getBrand() + getPosition());
		} else {
			System.out.println("Start engine ");
		}
	}

	public void step_back() {
		if (getEngine().Running()) {
			setPosition(getPosition() - 1);
			System.out.println(getBrand() + getPosition());
		} else {
			System.out.println("Start engine");
		}
	}

	public Engine getEngine() {
		return engine;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public int getPosition() {
		return position;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
