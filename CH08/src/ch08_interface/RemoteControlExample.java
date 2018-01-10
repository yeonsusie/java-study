package ch08_interface;

//구현 객체 생성 후 인터페이스 사용 예제
public class RemoteControlExample {

	public static void main(String[] args) {
		//static 메소드, 객체 생성 없이 바로 호출 가능
		RemoteControl.changeBattery();
		
		RemoteControl rc; //인터페이스 변수 생성
		rc = new Television(); //인터페이스 변수에 구현 객체 대입
		
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true); //재정의한 default 메소드
		//rc.turn(); 인터페이스에 정의된 메소드에만 접근 가능
		
		
		//익명 구현 객체
		//인터페이스 변수 선언과 동시에 구현 클래스 생성(메소드 재정의)
		RemoteControl rc1 = new RemoteControl(){
			private int volume;

			@Override
			public void turnOn() {
				System.out.println("익명 객체를 킵니다");
			}

			@Override
			public void turnOff() {
				System.out.println("익명 객체를 끕니다");
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("익명객체볼륨 : "+volume);
			}
			
		}; //클래스 선언이기 때문에 } 뒤 ; 꼭 붙이기
		
		rc1.turnOn();
		rc1.turnOff();
	}

}
