package ch09_annonymous_interface;

public class AnnonymousExample {

	public static void main(String[] args) {
		Annonymous anny = new Annonymous();
		
		//익명 객체 필드
		anny.field.turnOn();
		anny.field.turnOff();
		
		//메소드 내 익명 객체
		anny.method1();
		
		//매개변수 익명 객체
		anny.method2(new RemoteControl(){

			@Override
			public void turnOn() {
				System.out.println("maegae_turnon");
			}

			@Override
			public void turnOff() {
				System.out.println("maegae_turnon");
			}
			
		});
	}

}
