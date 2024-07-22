import java.util.*;
class student{
	int enroll_No;
	String gerder;
	int marks;

public student(int enroll_No,String gerder,int marks)
{
	this.enroll_No=enroll_No;
	this.gerder=gerder;
	this.marks=marks;
}
public void PrintDetail()
{
	System.out.println("enroll no:"+enroll_No);
	System.out.println("gender:"+gerder);
	System.out.println("marks:"+marks);


}
}
public class lab5_1
{
	public static void main(String arc[])
	 {
	 	student s1=new student(101,"male",10);
	 	s1.PrintDetail();
	 }
}