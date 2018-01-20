package ch10_02_exception;

//�Ϲ� ���� ó�� & ���� ���� ó�� ����
public class TryCatchExample {

	public static void main(String[] args) {
		//�Ϲ� ����_classNotFoundException
		try{
			//forname()�� �Ű������� ���� ���� Ŭ������ �ִ��� Ȯ��. ������ �� Ŭ������ ��ü ����
			Class clazz = Class.forName("java.lang.String2");
		} 
		catch(ClassNotFoundException e){
			System.out.println("Ŭ���� ���� ����");
		}
		
		//���� ����_arrayException_�迭 ��ȿ ���
		String data1 = null;
		String data2 = null;
		
		try{
			data1 = args[0]; //args[0]�� ���� ���� ��� ���� �߻�, args�迭�� ���� run configure�� ����
			data2 = args[1];
		} 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�Ű��� �� ����");
			return; //return�� �־ finally�� ����
		}
		
		//���� ����_numberException_���� �ƴ� �� ���� �� ����ó��
		try{
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}
		catch(NumberFormatException e){
			System.out.println("���ں�ȯ �ȵ�");
		}
		finally {
			System.out.println("�ٽ� ����");
		}
	}

}
