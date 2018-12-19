package OOPS;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		a.excellent();
		a.verygood();
		System.out.println("****************************************");
		C c = new C();
		c.excellent();
		c.verygood();
		c.fail();
		c.fair();
		c.poor();
		A ob = new C();
		ob.excellent();
		ob.fair();

	}

}
