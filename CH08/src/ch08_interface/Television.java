package ch08_interface;

//구현 클래스 - 구현 객체를 생성하기 위함
public class Television implements RemoteControl{
	private int volume;

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
		if(volume > RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else{
			this.volume = volume;
		}
		System.out.println("현재 tv 볼륨: " + volume);
		System.out.println("현재 tv 볼륨: " + this.volume);
	}
	
}
