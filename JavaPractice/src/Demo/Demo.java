package Demo;

class A {
	A() {
		super();
		System.out.println("In Class A");
	}

	A(int num) {
		super();
		System.out.println("In Class A with Parameter");
	}

}

class B extends A {

	B() {
		super();
		System.out.println("In Class B");
	}

	B(int num) {
		this();
		System.out.println("In Class B with parameter");
	}

}

public class Demo {

	public static void main(String[] args) {

		B obj = new B(5);

	}
}
