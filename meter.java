import java.util.*;
public class meter{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);

		int meter=sc.nextInt();
		double feet;

		feet=meter*3.28084;

		System.out.println(feet);
	}
}