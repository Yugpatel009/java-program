import java.util.*;
class Employee{
        int Employee_ID;
        String Employee_Name;
        int Age;
        float Salary;

        public void getEmployeeDetail(){
 			
 			Scanner sc=new Scanner(System.in);

 			System.out.println("Enter Employee_ID");
        	this.Employee_ID=sc.nextInt();

        	System.out.println("Enter Employee_Name");
        	 this.Employee_Name=sc.next();

        	 System.out.println("Enter Age");
        	 this.Age=sc.nextInt();

        	 System.out.println("Enter Salary");
        	 this.Salary=sc.nextFloat();	
        	}
        	public void DisplayEmployeeDatil()
        	{
        		System.out.println(" Employee_ID"+Employee_ID);
        		System.out.println(" Employee_Name"+Employee_Name);
        		System.out.println(" Age"+Age);
        		System.out.println(" Salary"+Salary);
        	}
}
public class lab5_2
{
	public static void main(String arc[])
	{
		Employee e1=new Employee();

		e1.getEmployeeDetail();
		e1.DisplayEmployeeDatil();
	}
}