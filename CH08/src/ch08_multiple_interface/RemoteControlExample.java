package ch08_multiple_interface;

public class RemoteControlExample {

	public static void main(String[] args) {
		//���� ��ü ����
		SmartTelevision tv = new SmartTelevision();
		
		Searchable sc = tv;
		sc.Search("http://naver.com");
		
		RemoteControl2 rc = tv;
		rc.turnOff();
		rc.turnOn();
		
	}

}
