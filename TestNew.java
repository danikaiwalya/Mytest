class A {
	
	A() {
		System.out.println("In A const");
	}
	void show() {
		System.out.println("A");
	}
}

class B  extends A{

	B() {
		System.out.println("In B const");
	}
	void show() {
		System.out.println("B");
			//super.show();
		System.out.println("B");
	}
}

class C  extends B{

	C() {
		System.out.println("In C const");
	}
	void show() {
		System.out.println("B");
			//super.show();
		System.out.println("B");
	}
}

class TestNew {
	public static void main(String a[]) {
		A obj = new A(2,"sra");
		obj.show();
		System.out.println("Finished");
	}
}
