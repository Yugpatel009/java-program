import java.util.Scanner;
public class lab3_3{

	//Area of circle
	public static double area (double r)
	{
		return (3.14*r*r);
	}

    // traiangle
	public static double area (double b,double h)
	{
		return ((1/2)*b*h);
	}

	// area oa square
	public static int area (int s)
	{
		return (s*s);
	}
	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter redis of Circle = ");
		double r=SC.nextDouble();
		System.out.println("area of Circle is :"+area(r));
		
		System.out.println("Enter brith of Triangle = ");
		double b=SC.nextDouble();
		System.out.println("Enter hight of Triangle = ");
		double h=SC.nextDouble();
		System.out.println("area of Triangle:"+area(b,h));
		
		System.out.println("Enter redis of Square = ");
		int s=SC.nextInt();
		System.out.println("area of Square:"+area(s));
	}
	
} 