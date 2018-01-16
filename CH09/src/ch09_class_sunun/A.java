package ch09_class_sunun;

//중첩클래스 예제
public class A { //바깥클래스
	A(){
		System.out.println("A객체가 생성됨");
	}
	
	/*인스턴스 멤버 클래스*/
	class B {
		B(){
			System.out.println("B객체가 생성됨");
		}
		int field1;
		//static int field2
		void method1(){System.out.println("B의 메소드"); }
		//static void method2(){}
	}
	
	/*정적 멤버 클래스*/
	static class C {
		C(){
			System.out.println("C객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1(){System.out.println("C의 메소드"); }
		static void method2(){System.out.println("C의 정적 메소드");}
	}
	
	void method(){
		/*로컬클래스*/
		class D{
			D(){
				System.out.println("D객체가 생성됨");
			}
			int field1;
			//static int field2;
			void method1(){System.out.println("D의 메소드"); }
			//static void method2(){}
		}
		
		//해당 메소드 내에서 바로 실행
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
	

}
