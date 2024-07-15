import java.util.*;
public class lab4_2{
	public static void main(String arc[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the size of array");
		int n=sc.nextInt();
		int[] a=new int[n];

		for (int i=0;i<a.length ;i++ ) {
			a[i]=sc.nextInt();
		}
          int odd=0;
          int even=0;
		for(int i=0;i<a.length;i++)
		{
			if (a[i]%2==0) {
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Number is even :"+even);

		System.out.println("Number is odd :"+odd);
	}
}