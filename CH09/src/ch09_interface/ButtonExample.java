package ch09_interface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		//callListener 구현 객체 대입
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		//messageListener 구현 객체 대입
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
