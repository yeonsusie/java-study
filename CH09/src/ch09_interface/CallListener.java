package ch09_interface;

//���� Ŭ����
public class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("call");
	}

}
