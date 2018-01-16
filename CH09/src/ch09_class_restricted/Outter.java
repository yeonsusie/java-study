package ch09_class_restricted;

//바깥 클래스의 필드/메소드 호출 예제
public class Outter {
	String field = "outter-field";
	String out_field = "outter-field";
	void method(){
		System.out.println("outter-method");
	}
	void out_method(){
		System.out.println("outter-method");
	}
	
	class Nested{
		String field = "nested-field";
		String nested_field = "nested-field";
		void method(){
			System.out.println("nested-method");
		}
		void nest_method(){
			System.out.println("nested-method");
		}
		
		//this키워드로 바깥 클래스 참조
		void print_this(){
			//outter클래스의 필드/메소드 호출
			System.out.println(Outter.this.field); 
			Outter.this.method();
			//nested클래스의 필드/메소드 호출
			System.out.println(this.field);
			this.method();
		}
		
		//이름이 다를 경우엔 this없이 바로 호출 가능
		void print(){
			System.out.println(out_field);
			out_method();
			System.out.println(nested_field);
			nest_method();
		}
		
		
	}

}
