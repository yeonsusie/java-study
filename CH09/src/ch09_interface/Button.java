package ch09_interface;

//��ø �������̽� ����
public class Button {
	OnClickListener listener; //�������̽� �ʵ�
	
	//�Ű����� ������, ������ü �޾Ƽ� ������ ����
	void setOnClickListener(OnClickListener listener){ 
		this.listener = listener;
	}
	
	void touch(){
		listener.onClick();
	}
	
	//��ø �������̽�, Ŭ���� ���� �������̽�
	interface OnClickListener {
		void onClick();
	}

}
