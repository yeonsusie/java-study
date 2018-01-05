package ch06_gettersetter;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.setSpeed(60);
		car.setStop(false);
		
		System.out.println(car.getSpeed());
		System.out.println(car.isStop());
	}

}
