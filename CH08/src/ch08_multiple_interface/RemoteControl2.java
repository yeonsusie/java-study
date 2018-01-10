package ch08_multiple_interface;

//인터페이스 선언 예제
public interface RemoteControl2 {
	
	//상수 필드, 선언과 동시에 초기값 필수
	//public static final이 자동으로 붙음
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드, 메소드 선언만 해줌
	//public abstract 가 자동으로 붙음
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드, 실행 부분 작성
	//public 자동 붙음
	public default void setMute(boolean mute){
		if(mute){
			System.out.println("무음처리");
		}
		else {
			System.out.println("무음처리 해제");
		}
	}
	
	//정적 메소드, 실행 부분 작성, 객체 없이 실행 가능
	//public 자동 붙음
	public static void changeBattery(){
		System.out.println("건전지 교환");
	}

}
