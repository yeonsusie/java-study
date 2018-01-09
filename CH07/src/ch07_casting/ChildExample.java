package ch07_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parents parents = new Child();
		
		parents.field1 = "data1";
		parents.method1();
		parents.method2();
		
		//부모클래스의 필드,메소드(재정의안되어있을경우)만 접근 가능
		//parents.field2 = "data2";
		//parents.method3();
		
		Child child = (Child) parents;
		
		child.field2 = "data2";
		child.method3();
	}

}
