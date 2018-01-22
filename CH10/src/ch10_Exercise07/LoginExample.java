package ch10_Exercise07;

public class LoginExample {

	public static void main(String[] args) {
		try{
			login("white", "12345");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		try{
			login("blue", "54321");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

	}
	
	public static void login(String id, String password) throws Exception {
		
		//id�� 'blue'�� �ƴϸ� NotExistIDException �߻�
		if(!id.equals("blue")){
			throw new NotExistIDException("���̵��������");
		}
		
		//pw�� '12345'�� �ƴϸ� WrongPasswordException �߻�
		if(!password.equals("12345")){
			throw new WrongPasswordException("�н����� Ʋ��");
		}
	}

}
