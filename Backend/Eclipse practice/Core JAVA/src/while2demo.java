import java.util.Scanner;

public class while2demo {
public static void main(String[] args) {
	int n , sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	n=sc.nextInt();
	do
	{
		sum=sum+n;
		n--;
	}while(n>0);
	System.out.println("Sum : "+sum);
}
}
