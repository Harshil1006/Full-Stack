
public class StaticMethod {

	static int a=10;
	static int b;
	{
		System.out.println("Block 1");
	}
	public StaticMethod() {
		System.out.println("Constrctor");
	}
	static void math(int x)
	{
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("X : "+x);
	}
	static
	{
		System.out.println("Static Block Initialized");
		b=a*4;
	}
	public static void main(String[] args) {
		
		math(12);
		StaticMethod s=new StaticMethod();
	}
	{
		System.out.println("Block 2");
	}
}
