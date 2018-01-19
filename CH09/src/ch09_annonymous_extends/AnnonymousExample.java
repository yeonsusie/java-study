package ch09_annonymous_extends;

public class AnnonymousExample {

	public static void main(String[] args) {
		Annonymous anny = new Annonymous();
		
		//익명 객체 필드 사용
		anny.field.wake();
		
		//메소드 내 익명 객체 사용
		anny.method1();
		
		//매개변수로 익명 객체 사용
		anny.method2(new Person(){
			void study(){
				System.out.println("study");
			}
			
			@Override
			void wake(){
				System.out.println("maegae_override_일어납니다");
				study();
			}
		});
	}

}
