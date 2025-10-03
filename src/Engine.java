package programming_paradigm;

public class Engine {
	private boolean condition;

	void startEngine() {
		condition = true;
		System.out.println("engine start");
	}

	void stopEngine() {
		condition = false;
		System.out.println("engine stop");
	}

	boolean Running() {
		return condition;
	}

}
