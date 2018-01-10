package ch08_multiple_interface;


//���� �������̽� ���� Ŭ����
public class SmartTelevision implements RemoteControl2, Searchable {
	private int volume;

	@Override
	public void Search(String url) {
		System.out.println(url + "�� �˻��մϴ�");
		
	}

	@Override
	public void turnOn() {
		System.out.println("tv�� ŵ�ϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv�� ���ϴ�");
		
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
		System.out.println("���� tv ����: " + volume);
		System.out.println("���� tv ����: " + this.volume);
		
	}

}
