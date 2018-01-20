package ch07Exercise;

public class Parent {
	public String nation;
	public Parent(String nation){
		this.nation = nation;
		System.out.println("parent(string)");
		System.out.println(nation);
	}
	
	public Parent(){
		this("ºÎ¸ð");
		System.out.println("parent()");
	}
	
//	public Parent(String nation){
//		this.nation = nation;
//		System.out.println("parent(string)");
//		System.out.println(nation);
//	}

}
