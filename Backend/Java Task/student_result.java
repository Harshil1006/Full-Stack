import java.util.Scanner;
public class student_result {

	public static void main(String[] args) {
		int rno,s1,s2,s3,total;
		double per;
		String sname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		sname=sc.next();
		System.out.println("Enter Your Roll no : ");
		rno=sc.nextInt();
		System.out.println("Enter Marks Of Subject 1 : ");
		s1=sc.nextInt();
		System.out.println("Enter Marks Of Subject 2 : ");
		s2=sc.nextInt();
		System.out.println("Enter Marks Of Subject 3 : ");
		s3=sc.nextInt();
		
		total=s1+s2+s3;
		System.out.println("Total : "+total);
	}
}
