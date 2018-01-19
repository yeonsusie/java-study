package ch09_annonymous_button;

//button의 인터페이스의 익명 구현 객체 생성
public class Window {
	//버튼 두개 
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 대입으로 인터페이스 구현 객체 생성
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("button1");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("button2");
				
			}
		});
		
	}

}
