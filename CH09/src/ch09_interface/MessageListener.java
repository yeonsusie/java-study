package ch09_interface;

//���� Ŭ����
public class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("message");
	}

}
