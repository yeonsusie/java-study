package ch10_02_exception;

//일반 예외 처리 & 실행 예외 처리 예제
public class TryCatchExample {

	public static void main(String[] args) {
		//일반 예외_classNotFoundException
		try{
			//forname()은 매개변수로 들어온 값의 클래스가 있는지 확인. 있으면 그 클래스의 객체 리턴
			Class clazz = Class.forName("java.lang.String2");
		} 
		catch(ClassNotFoundException e){
			System.out.println("클래스 존재 안함");
		}
		
		//실행 예외_arrayException_배열 유효 벗어남
		String data1 = null;
		String data2 = null;
		
		try{
			data1 = args[0]; //args[0]에 값이 없을 경우 예외 발생, args배열의 값은 run configure로 대입
			data2 = args[1];
		} 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("매개값 수 부족");
			return; //return이 있어도 finally가 실행
		}
		
		//실행 예외_numberException_숫자 아닌 값 들어올 때 예외처리
		try{
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}
		catch(NumberFormatException e){
			System.out.println("숫자변환 안됨");
		}
		finally {
			System.out.println("다시 실행");
		}
	}

}
