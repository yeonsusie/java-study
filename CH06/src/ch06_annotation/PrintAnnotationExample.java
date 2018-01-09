package ch06_annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		//service 클래스의 메소드 정보를 불러옴.
		//리턴타입이 method[]인 배열 생성, 어노테이션 붙여진 메소드 배열로 모두 가져오는 getDeclare함수 사용
		Method[] declareMethod = Service.class.getDeclaredMethods();
		
		//가져온 메소드배열을 향상된 for문으로 하나씩 어노테이션 붙여있나 확인
		for(Method method : declareMethod) {
			//가져온 메소드에 @PrintAnnotation이 붙여있는지 확인
			if(method.isAnnotationPresent(PrintAnnotation.class)){
				//붙여있다면 printannotation 클래스의 객체 얻음
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			
			//메소드의 이름 출력 함수 : method.getName()
			//예를들어 method.getName()을 할경우 서비스에서 생성한 method1,method2가 나옴
			System.out.println("[" + method.getName() + "]");
			
			//구분선("-----") 출력
			//위에서 생성한 printAnnotation 객체로 넘버와 발류값 불러옴
			for(int i = 0; i< printAnnotation.number(); i++){
				System.out.print(printAnnotation.value());
			}
			System.out.println();
			
			//Service 클래스의 메소드 실행(method1,method2,method3)
			try {
				//아래 코드를 풀어쓰면, 
				//Service service = new Service(); service.method1();
				method.invoke(new Service());
			} catch (Exception e) {}
			System.out.println();
			
			}
		}
	}

}
