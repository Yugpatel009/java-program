import java.util.*;

public class lab2_3
{
	public static void main(String[] arc)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a two Number");
		int n1=sc.nextInt(),n2=sc.nextInt();
        System.out.print("Enter choice");
		// System.out.print("+\n-\n/\n*");
		char choice=sc.next().charAt(0);
		switch(choice)
		{
		case '+':
			
			System.out.print("Addition="+(n1+n2));
			break;

		case '-':
		 
		  System.out.print("subcrition="+(n1-n2));
		  break;

		case '/':
	
		System.out.print("Division="+(n1/n2));
		break;

		case '*':
		
		System.out.print("multipication="+(n1*n2));
		break;
  	    
  	    default:
  	    	System.out.print("Invalid choice");
		}
		// System.out.print("Invalid choice");
	}
}