
/* Primitive Data Types
 * 
 * 1. byte Byte
 * 2. short Short
 * 3. int Integer
 * 4. long Long
 * 5. float Float
 * 6. double Double
 * 7. char Character
 * 8. boolean Boolean
 *  ASCII : American Standard Code For Information Interchange
 *  A-Z : 65 to 90
 *  a-z : 97 to 122
 * */

import java.util.Scanner;

public class Sample {
	
	static public void main(String[] tops) {
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		System.out.print("Enter A : ");
		a=sc.nextDouble();
		System.out.print("Enter B : ");
		b=sc.nextDouble();
		c=a+b;
		System.out.println("Addition : "+c);
		c=a-b;
		System.out.println("Subtraction : "+c);
		c=a*b;
		System.out.println("Multiplication : "+c);
		c=a/b;
		System.out.println("Division : "+c);
	}
}
