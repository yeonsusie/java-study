package ch07_abstract;

public class SmartPhone extends Phone {
	public SmartPhone(String owner){
		super(owner);
	}
	
	public void internetOn(){
		System.out.println("인터넷킵니다");
	}

}
