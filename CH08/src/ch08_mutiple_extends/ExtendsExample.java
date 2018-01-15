package ch08_mutiple_extends;

public class ExtendsExample {
	public static void main(String args[]){
		Extends extend = new Extends();
		
		//타입이 interfaceA이므로 methodA에만 접근 가능
		InterfaceA a = extend;
		a.methodA();
		System.out.println();
		
		//타입이 interfaceB이므로 methodB에만 접근 가능
		InterfaceB b = extend;
		b.methodB();
		System.out.println();
		
		//타입이 interfaceC이므로 상속받은 methodA,methodB,methodC 모두 접근 가능
		InterfaceC c = extend;
		c.methodA();
		c.methodB();
		c.methodC();
		
	}

}
