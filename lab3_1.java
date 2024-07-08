import java.util.*;
public class lab3_1{
	public static double Simple(double p,double r,double n)
	{
		return (p*r*n)/100;
	}
	public  static void main(String[] arc)
	{
		Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter the p,r,n");
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double n=sc.nextDouble();

		double ans=Simple(p,r,n);
		System.out.println("Simple intrst="+ans);
	}
}