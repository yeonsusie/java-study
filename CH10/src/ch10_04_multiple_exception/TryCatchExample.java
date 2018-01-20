package ch10_04_multiple_exception;

//����,��Ƽ catch ����
public class TryCatchExample {

	public static void main(String[] args) {
		try{
			//arrayException
			String data1 = args[0];
			String data2 = args[1];
			
			//numberException
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}
		//��Ƽ catch_'|'�����ڷ� or ǥ�� ����
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
			System.out.println("array�� number ���� ó��");
		}
		
		//���� catch(catch�� ������)
		//Exception e�� ���� ���� Ŭ�����̹Ƿ� ���� �Ʒ��� �ۼ��ؾ���.
		catch(Exception e){
			System.out.println("array�� number ������ ���ܴ� �� catch�� �� �ذ�");
		}
		
		finally {
			System.out.println("���α׷� ����");
		}
	}

}
