import java.util.*;
public class lab3_2
{
	public static int maxvalue(int a,int b,int c)
	{
		if (a>b && a>c) {
			return a;
		}
		else if(b>a && b>c)
		{
			return b;
		}

		else{
			return c;
		}
	}

	public static void main(String arc[])
	{
           Scanner sc=new Scanner(System.in);

           int a=sc.nextInt();
           int b=sc.nextInt();
           int c=sc.nextInt();

           int ans=maxvalue(a,b,c);

           System.out.println("Maxmim Number of="+ans);	
	}
}