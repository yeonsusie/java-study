package ch09_class_restricted;

//인스턴스 멤버 클래스, 정적 멤버 클래스, 로컬 클래스에서의 접근 예제
public class A {
	
	// 1)바깥 클래스에서 클래스 멤버의 객체 생성
	
	/*인스턴스 필드와 메소드로 생성*/
	B ins_b = new B();
	C ins_c = new C();
	
	void in_method(){
		B ins_b = new B();
		C ins_c = new C();
	}
	
	/*정적 필드와 메소드로 생성*/
	//인스턴스 멤버 클래스인 B객체 생성 못함
	static C sta_c = new C();
	
	static void st_method(){
		C sta_c = new C();
	}
	
	
	// 2)멤버 클래스 에서 바깥 클래스의 필드/메소드 접근
	int ins_field;
	void ins_method(){}
	
	static int sta_field;
	static void sta_method(){}
	
	/*인스턴스 멤버 클래스*/
	//모두 접근 가능
	class B{
		void method(){
			ins_field = 1;
			ins_method();
			
			sta_field = 2;
			sta_method();
		}
	}
	
	/*정적 멤버 클래스*/
	//정적 필드와 메소드에만 접근 가능
	static class C{
		void method(){
			sta_field = 3;
			sta_method();
		}
		
	}
	
	
	// 3) 로컬 클래스에서의 사용제한
	String a = "local";
	void a(){System.out.println("locallll");}
	
	void outMethod(int arg){
		int localVar = 1;
		//arg = 10;, localVar = 100; 으로 변경 못함. final 키워드가 자동으로 붙기 때문
		
		class Inner{
			//로컬변수와 매개변수 사용하기
			void method(){
				int result = arg + localVar;
				System.out.println(result);
			}
			
			//로컬 클래스에서는 바깥 클래스의 필드와 메소드 자유롭게 사용 가능
			void use(){
				System.out.println(a);
				a();
			}
		}
	}

}
