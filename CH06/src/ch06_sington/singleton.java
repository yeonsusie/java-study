package ch06_sington;

public class singleton {
	//객체생성, 하나 만들어놓고 이 객체만 계속 호출하여 사용함
	private static singleton singleton = new singleton();

	private singleton(){} //생성자를 private로
	
	//getInstance 메소드를 이용하여 만들어놓은 객체만 계속 호출
	static singleton getInstance(){
		return singleton;
	}
}
