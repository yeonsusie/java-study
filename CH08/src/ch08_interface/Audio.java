package ch08_interface;

//구현 클래스 - 구현 객체를 생성하기 위함
public class Audio implements RemoteControl{
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("audio를 킵니다");
	}

	@Override
	public void turnOff() {
		System.out.println("audio를 끕니다");
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
		System.out.println("현재 audio 볼륨: " + volume);
		System.out.println("현재 audio 볼륨: " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute){
		if(mute){
			System.out.println("audio 무음처리");
		}
		else {
			System.out.println("audio 무음처리 해제");
		}
	}
	
	public void turn(){
		System.out.println("turn");
	}
	
}
