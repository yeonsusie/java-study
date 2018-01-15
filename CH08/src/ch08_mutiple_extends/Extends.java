package ch08_mutiple_extends;

//interfaceA, interfaceB, interfaceC의 메소드 모두 재정의 필요
public class Extends implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("methodA입니다");
	}

	@Override
	public void methodB() {
		System.out.println("methodB입니다");
	}

	@Override
	public void methodC() {
		System.out.println("methodC입니다");
	}

}
