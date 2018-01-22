package ch10_05_autocloseable;

//try-with-resource ����
public class TryWithResourceExample {

	public static void main(String[] args) {
		//������ try�� �޸� ()�ȿ� ���ҽ� ��ü ����
		//()���� ���೻���� ������� �ǰų� ���ܰ� �߻��� ��� �ڵ����� closeȣ���
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception(); //�Ϻη� ����ó�� �� ��
		}
		catch(Exception e){
			System.out.println("����ó��");
		}
	}

}
