package ch10_05_autocloseable;

//리소스 객체 구현 _ AutoCloseable 인터페이스 구현 필수
public class FileInputStream implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file){
		this.file = file;
	}
	
	public void read(){
		System.out.println(file + "읽습니다");
	}

	//리소스 닫을 때 해당 close메소드가 자동 호출됨
	@Override
	public void close() throws Exception {
		System.out.println("종료");
	}
	
	

}
