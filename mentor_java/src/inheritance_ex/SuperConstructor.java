package inheritance_ex;

class Car2{
	int wheel;
	int speed;
	String color;
	
	Car2(String color) {
		this.color = color;
	}
}

class SportsCar extends Car2{
	int speedLimit;

	SportsCar(String color, int speedLimit) {
		super(color);
		this.speedLimit = speedLimit;
	}
	
}

public class SuperConstructor {

	public static void main(String[] args) {
		
		SportsCar s1 = new SportsCar("red", 330);
		System.out.println(s1.color);
		System.out.println(s1.speedLimit);

	}

}
