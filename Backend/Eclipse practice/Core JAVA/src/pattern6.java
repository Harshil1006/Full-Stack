
public class pattern6 {
public static void main(String[] args) {
	int i,j,k;
	for(i = 75;i>=65;i--) {
		for(k=65;k<=75-i;k++) {
			System.out.print(" ");
		}
		for(j=65;j<=i;j++) {
			System.out.print(" "+(char)i);
		}
			System.out.println();
		}
	}
}
