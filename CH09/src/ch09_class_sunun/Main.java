package ch09_class_sunun;

import ch09_class_sunun.A.C;

public class Main {

	public static void main(String[] args) {
		//바깥 클래스 객체 생성
		A a = new A();
		
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1=1;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C(); //정적 멤버 클래스 내의 인스턴스 필드/메소드는 객체를 생성하여 접근
		c.field1=2;
		c.method1();
		A.C.field2=2;
		A.C.method2();
		
		//로컬 클래스 접근 -> 메소드 호출
		a.method();
	}

}
