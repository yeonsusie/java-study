package ch09_annonymous_interface;

//익명 구현 객체 예제
public class Annonymous {
	
	//필드로 대입
	RemoteControl field = new RemoteControl(){

		@Override
		public void turnOn() {
			System.out.println("field_turnon");
			
		}

		@Override
		public void turnOff() {
			System.out.println("field_turnoff");
			
		}
		
	};
	
	//메소드로 대입
	void method1(){
		RemoteControl local = new RemoteControl(){

			@Override
			public void turnOn() {
				System.out.println("local_turnon");
				
			}

			@Override
			public void turnOff() {
				System.out.println("local_turnoff");
				
			}
			
		};
		local.turnOn();
		local.turnOff();
	}
	
	void method2(RemoteControl rc){
		rc.turnOn();
		rc.turnOff();
	}

}
