package ch08_interface;

//���� Ŭ���� - ���� ��ü�� �����ϱ� ����
public class Audio implements RemoteControl{
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("audio�� ŵ�ϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("audio�� ���ϴ�");
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
		System.out.println("���� audio ����: " + volume);
		System.out.println("���� audio ����: " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute){
		if(mute){
			System.out.println("audio ����ó��");
		}
		else {
			System.out.println("audio ����ó�� ����");
		}
	}
	
	public void turn(){
		System.out.println("turn");
	}
	
}
