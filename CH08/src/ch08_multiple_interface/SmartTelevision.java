package ch08_multiple_interface;


//다중 인터페이스 구현 클래스
public class SmartTelevision implements RemoteControl2, Searchable {
	private int volume;

	@Override
	public void Search(String url) {
		System.out.println(url + "을 검색합니다");
		
	}

	@Override
	public void turnOn() {
		System.out.println("tv를 킵니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl2.MAX_VOLUME){
			this.volume = RemoteControl2.MAX_VOLUME;
		}
		else if(volume < RemoteControl2.MIN_VOLUME){
			this.volume = RemoteControl2.MIN_VOLUME;
		}
		else{
			this.volume = volume;
		}
		System.out.println("현재 tv 볼륨: " + volume);
		System.out.println("현재 tv 볼륨: " + this.volume);
		
	}

}
