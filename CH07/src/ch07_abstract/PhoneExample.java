package ch07_abstract;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); 단독적으로 객체 생성 불가
		
		//자식클래스인 smartphone으로 추상클래스 메소드에 접근
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();
		smartphone.turnOff();
		smartphone.internetOn();
	}

}
