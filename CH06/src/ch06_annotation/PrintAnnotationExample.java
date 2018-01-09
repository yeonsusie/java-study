package ch06_annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		//service Ŭ������ �޼ҵ� ������ �ҷ���.
		//����Ÿ���� method[]�� �迭 ����, ������̼� �ٿ��� �޼ҵ� �迭�� ��� �������� getDeclare�Լ� ���
		Method[] declareMethod = Service.class.getDeclaredMethods();
		
		//������ �޼ҵ�迭�� ���� for������ �ϳ��� ������̼� �ٿ��ֳ� Ȯ��
		for(Method method : declareMethod) {
			//������ �޼ҵ忡 @PrintAnnotation�� �ٿ��ִ��� Ȯ��
			if(method.isAnnotationPresent(PrintAnnotation.class)){
				//�ٿ��ִٸ� printannotation Ŭ������ ��ü ����
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			
			//�޼ҵ��� �̸� ��� �Լ� : method.getName()
			//������� method.getName()�� �Ұ�� ���񽺿��� ������ method1,method2�� ����
			System.out.println("[" + method.getName() + "]");
			
			//���м�("-----") ���
			//������ ������ printAnnotation ��ü�� �ѹ��� �߷��� �ҷ���
			for(int i = 0; i< printAnnotation.number(); i++){
				System.out.print(printAnnotation.value());
			}
			System.out.println();
			
			//Service Ŭ������ �޼ҵ� ����(method1,method2,method3)
			try {
				//�Ʒ� �ڵ带 Ǯ���, 
				//Service service = new Service(); service.method1();
				method.invoke(new Service());
			} catch (Exception e) {}
			System.out.println();
			
			}
		}
	}

}
