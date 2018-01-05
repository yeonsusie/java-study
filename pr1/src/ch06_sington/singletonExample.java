package ch06_sington;

public class singletonExample {

	public static void main(String[] args) {
		//error³ª´Â ½Ì±ÛÅæ °´Ã¼ È£Ãâ
		//singleton obj1 = new singleton();
		
		//¿Ã¹Ù¸¥ ½Ì±ÛÅæ °´Ã¼ È£Ãâ
		singleton obj1 = singleton.getInstance();
		singleton obj2 = singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("°°Àº °´Ã¼ ÂüÁ¶");
		}
		
	}

}
