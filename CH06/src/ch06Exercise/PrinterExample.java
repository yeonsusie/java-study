package ch06Exercise;

public class PrinterExample {

	public static void main(String[] args) {
		//�ν��Ͻ� ��ü ���� -> println���� �� ���
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		System.out.println();
		
		//static �޼ҵ� ȣ��
		Printer.println1(10);
		Printer.println1(true);
		Printer.println1(5.7);
		Printer.println1("ȫ�浿");

	}

}
