package ch06Exercise;

public class PrinterExample {

	public static void main(String[] args) {
		//인스턴스 객체 생성 -> println으로 값 출력
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		System.out.println();
		
		//static 메소드 호출
		Printer.println1(10);
		Printer.println1(true);
		Printer.println1(5.7);
		Printer.println1("홍길동");

	}

}
