package ch08_casting;

public class Example {

	public static void main(String[] args) {
		//인터페이스 매개변수 다형성
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		System.out.println("");
		
		//강제타입변환
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		Bus buss = (Bus) vehicle;
		buss.checkFare();
	}

}
