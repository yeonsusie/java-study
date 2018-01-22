package ch10_05_autocloseable;

//���ҽ� ��ü ���� _ AutoCloseable �������̽� ���� �ʼ�
public class FileInputStream implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file){
		this.file = file;
	}
	
	public void read(){
		System.out.println(file + "�н��ϴ�");
	}

	//���ҽ� ���� �� �ش� close�޼ҵ尡 �ڵ� ȣ���
	@Override
	public void close() throws Exception {
		System.out.println("����");
	}
	
	

}
