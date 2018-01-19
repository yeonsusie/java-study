package ch09_annonymous_extends;

//익명 자식 객체 생성 - 필드/메소드/매개변수
public class Annonymous {
	
	//필드로 대입
	Person field = new Person() {
		void work(){
			System.out.println("work");
		}
		
		@Override
		void wake(){
			System.out.println("field_override_일어납니다");
			work();
		}
	};
	
	//메소드로 대입
	void method1(){
		Person local = new Person(){
			void walk(){
				System.out.println("walk");
			}
			@Override
			void wake(){
				System.out.println("local_override_일어납니다");
				walk();
			}
			
		};
		local.wake();
	}
	
	//매개변수로 대입
	void method2(Person person){
		person.wake();
	}

}
