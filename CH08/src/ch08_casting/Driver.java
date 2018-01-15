package ch08_casting;

//매개변수의 다형성 및 강제타입변환 예제
public class Driver {

	public void drive(Vehicle vehicle){
		if(vehicle instanceof Bus){ //매개변수로 들어온 객체가 bus가 맞으면 강제타입변환 -> bus만의 메소드 실행
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
