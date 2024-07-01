import java.util.*;

public class lab2_2
{
	public static void main(String[] arc)
	{
		Scanner sc=new Scanner(System.in);
          
        System.out.print("Enter Number");
		int num=sc.nextInt();
        
        if (num>0) {
        	System.out.print("Number is positiv");
        }

        else if(num==0)
        {
        	System.out.print("Number is Zero");
        }
        else
        {
        	System.out.print("Number is negativ");
        }

	}
}