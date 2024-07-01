import java.util.Scanner;
public class Max_from_3{

	public static void main(String[] args){


		Scanner obj = new Scanner(System.in);

		System.out.print("Enter 3 num: ");
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();

		System.out.print("Max is: "+ Max(a,b,c));

	}

	public static int Max(int a, int b, int c){

		if(a>b && a>c)
			return a;
		else if(b>c && b>a)
			return b;
		else
			return c;

	}

}