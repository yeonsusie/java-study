package ch09_annonymous_button;

//중첩 인터페이스 + 익명 구현 객체 예제
public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener){
		this.listener = listener;
	}
	
	void touch(){
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}

}
