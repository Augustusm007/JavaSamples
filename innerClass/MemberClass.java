package innerClass;

public class MemberClass {

	public static void main(String[] args) {

		A a = new A();
		A.B x = a.new B();
		x.show();

	}

}

class A {
	int i;

	class B {

		public void show() {
			System.out.println("This is from B class");
		}
	}

}