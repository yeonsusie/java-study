package ch08_multiple_interface;

public class RemoteControlExample {

	public static void main(String[] args) {
		//备泅 按眉 积己
		SmartTelevision tv = new SmartTelevision();
		
		Searchable sc = tv;
		sc.Search("http://naver.com");
		
		RemoteControl2 rc = tv;
		rc.turnOff();
		rc.turnOn();
		
	}

}
