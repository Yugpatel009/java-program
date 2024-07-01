import java.util.*;

public class lab_2_1
{
	public static void main(String[] arc)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a area");
		double area=sc.nextDouble();
		double PI=3.14;

		double ans=Math.sqrt(area/PI);

		System.out.println("Entered area of R="+ans);
	}
}