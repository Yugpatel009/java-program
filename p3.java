
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
 class C extends B
 {
 	public void displayC()
 	{
 		System.out.println("class b");
 	}
 }
public class p3
{
	public static void main(String[] args)
	{
		System.out.println("multilehel");
		A a=new A();
		B b=new B();
		a.displayA();
		b.displayA();
		b.displayB();
		C c=new C();
		c.displayA();
		c.displayB();
		c.displayC();	
	}
}