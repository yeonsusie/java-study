package ch10_04_multiple_exception;

//다중,멀티 catch 예제
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
		//멀티 catch_'|'연사자로 or 표현 가능
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
			System.out.println("array와 number 예외 처리");
		}
		
		//다중 catch(catch가 여러개)
		//Exception e는 상위 예외 클래스이므로 제일 아래에 작성해야함.
		catch(Exception e){
			System.out.println("array와 number 제외한 예외는 이 catch로 다 해결");
		}
		
		finally {
			System.out.println("프로그램 종료");
		}
	}

}
