import java.util.*;
public class lab4_3{
	public static void main(String arc[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of row");
		int n=sc.nextInt();

			System.out.print("Enter the size of row");
			int b=sc.nextInt();
		int[][] a=new int[n][b];

		for (int i=0;i<n ;i++ ) {
			for (int j=0; j<b; j++) {
				
			a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Entered element are");

		for (int i=0;i<n ;i++ ) {
			for (int j=0; j<b; j++) {
			System.out.print(a[i][j]+" ");
				
			}
			System.out.println("");
	}
		}
		
}