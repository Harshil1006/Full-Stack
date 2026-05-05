import java.util.Scanner;

public class twodarray {
public static void main(String[] args) {
	int a[][]=new int [3][3];
	int i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 D array");
	
	for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            	a[i][j] = sc.nextInt();
        	}
		}
	System.out.println("2 D Array is");
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			//System.out.println("A["+i+"]["+j+"] = "+a[i][j]);
			System.out.println(" "+a[i][j]);
		}
			System.out.println();
		}
	}
}


