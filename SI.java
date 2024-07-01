import java.util.Scanner;
public class SI{

	public static void main(String[] a){

		Scanner obj = new Scanner(System.in);

		System.out.print("Enter Princial,Rate of intrest and time: ");

		double P = obj.nextDouble();
		double R = obj.nextDouble();
		double T = obj.nextDouble();

		System.out.print("INTREST IS: "+intrest(P,R,T)); 


	}
	public static double intrest(double p, double r, double t){

		return ((p*r*t)/100);

	}

}