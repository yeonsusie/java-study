package ch07_abstract;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound(); //dog에서 재정의한 sound 메소드 호출
		cat.sound(); //cat에서 재정의한 sound 메소드 호출
		
		System.out.println("---------------");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		
		System.out.println("---------------");
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal){
		animal.sound();
	}

}
