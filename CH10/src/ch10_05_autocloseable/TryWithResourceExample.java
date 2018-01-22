package ch10_05_autocloseable;

//try-with-resource 예제
public class TryWithResourceExample {

	public static void main(String[] args) {
		//기존의 try와 달리 ()안에 리소스 객체 생성
		//()안의 실행내용이 정상실행 되거나 예외가 발생할 경우 자동으로 close호출됨
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception(); //일부러 예외처리 한 것
		}
		catch(Exception e){
			System.out.println("예외처리");
		}
	}

}
