/*hierachical*/
class A
 {
 	public void displayA()
 	{
 		System.out.println("class a");
 	}
 }
 class B extends A
 {
 	public void displayB()
 	{
 		System.out.println("class b");
 	}
 }
 class C extends A
 {
 	public void displayC()
 	{
 		System.out.println("class b");
 	}
 }
public class p4
{
	public static void main(String[] args)
	{
		System.out.println("hierachical");

		A a=new A();
		B b=new B();
		a.displayA();
		b.displayA();
		b.displayB();
		C c=new C();
		c.displayA();
		c.displayC();	
	}
}