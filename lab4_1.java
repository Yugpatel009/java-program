import java.util.*;
public class lab4_1{
	public static void main(String arc[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array");
		int n=sc.nextInt();
		int[] a=new int[n];

		for (int i=0;i<a.length ;i++ ) {
			a[i]=sc.nextInt();
		}

		System.out.print("Entered element are");

		for (int i=1; i<=a.length; i++) {
			System.out.println(i);
		}
	}
}