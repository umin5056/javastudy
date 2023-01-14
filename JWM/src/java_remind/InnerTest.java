package java_remind;

class A {
	
	int i = 100;
	
	B b = new B();
	
	class B {

		void method() {
			System.out.println(i);
		}
		
	}
}


class C {
	
}
		
public class InnerTest {

	public static void main(String[] args) {

		A a = new A();
		
		a.b.method();
		
	}

}
