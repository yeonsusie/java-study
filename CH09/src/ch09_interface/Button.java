package ch09_interface;

//중첩 인터페이스 예제
public class Button {
	OnClickListener listener; //인터페이스 필드
	
	//매개변수 다형성, 구현객체 받아서 리스너 대입
	void setOnClickListener(OnClickListener listener){ 
		this.listener = listener;
	}
	
	void touch(){
		listener.onClick();
	}
	
	//중첩 인터페이스, 클래스 내의 인터페이스
	interface OnClickListener {
		void onClick();
	}

}
