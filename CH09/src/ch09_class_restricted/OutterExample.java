package ch09_class_restricted;

public class OutterExample {

	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Nested nest = out.new Nested();
		nest.print_this();
		System.out.println();
		nest.print();
	}

}
