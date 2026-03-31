import java.util.Scanner;

class A
{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A : ");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A : "+a);
	}
}

class B extends A
{
	int b;
	void getB() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter B : ");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B : "+b);
	}
}
public class Singleinheritance {
	public static void main(String[] args) {
		B b1 = new B();
		b1.getA();
		b1.getB();
		b1.putA();
		b1.putB();
		
	}
}
