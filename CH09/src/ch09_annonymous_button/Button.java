package ch09_annonymous_button;

//��ø �������̽� + �͸� ���� ��ü ����
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
