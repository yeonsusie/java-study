package ch07Exercise;

public class Child extends Parent{
	public Child(){
		this("�ڽ�");
		System.out.println("child()");
	}

	public Child(String nation){
		this.nation = nation;
		System.out.println("child(string)");
		System.out.println(nation);
	}
}
