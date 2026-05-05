import java.util.Scanner;

public class array_test {
	public static void main(String[] args) {
		int n,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Elements : ");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the Elements : ");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}
			}
		}
		System.out.println("Array is in ascending order : ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}
			}
		}
		System.out.println("Array is in decending order");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i] +" ");
		}
	}
}