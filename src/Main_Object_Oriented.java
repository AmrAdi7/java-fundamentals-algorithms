package programming_paradigm;

public class Main_Object_Oriented {

	public static void main(String[] args) {
		Mercedes myCar = new Mercedes("white");
		System.out.println("Brand: " + myCar.getBrand());
		System.out.println("Color: " + myCar.getColor());

		myCar.startEngine();
		myCar.step_forward();
		myCar.step_back();
		myCar.stopEngine();
		myCar.step_back();

	}

}
