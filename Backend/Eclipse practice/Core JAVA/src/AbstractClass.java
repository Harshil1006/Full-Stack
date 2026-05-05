
abstract class Abs1
{
	void math1()
	{
		System.out.println("Math1");
	}
	abstract void math2();
	abstract void math3();
}
class Abs2 extends Abs1
{
	void math2() {
		System.out.println("Math2 Defined In ABS2");
	}
	void math3() {
		System.out.println("Math3 Defined In ABS2");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Abs2 a=new Abs2();
		a.math1();
		a.math2();
		a.math3();
	}
}
