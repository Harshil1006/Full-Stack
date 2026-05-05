import java.util.Scanner;

public class switchcase {
public static void main(String[] args) {
	int a,b,ans,choice;
	boolean flag=true;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A : ");
	a=sc.nextInt();
	System.out.println("Enter B : ");
	b=sc.nextInt();
	while(flag)
	{
		System.out.println("*******************************************");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		System.out.println("*******************************************");
		System.out.println("Enter Your Choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			ans=a+b;
			System.out.println("Addition : "+ans);
			break;
		case 2:
			ans = a-b;
			System.out.println("Subtraction : "+ans);
			break;
		case 3:
			ans = a*b;
			System.out.println("Multiplication : "+ans);
		case 4:
			ans = a/b;
			System.out.println("Multiplication : "+ans);
			break;
		case 5:
			System.out.println("Thank You for Using Our Services");
			flag=false;
			break;
		default:
				System.out.println("Invalid Choice");
				break;
		
			}
		}
	}
}
