import java.util.Scanner;
public class area{
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter choice(circle = 1,triangle = 2,square = 3): ");
          int choice = sc.nextInt();

          if(choice == 1){
               System.out.print("Enter radius");
               double rad = sc.nextDouble();
               area(rad);
          }
          else if(choice == 2){
               System.out.print("Enter base and height: ");
               double base = sc.nextDouble();
               double height = sc.nextDouble();
               area(base,height);
          }
          else if(choice == 3){
               System.out.print("Enter side: ");
               int side = sc.nextInt();
               area(side);
          }

     }

          public static void area(double r){
               System.out.println("Area is: "+(3.14*r*r));
          }

          public static void area(double b, double h){
               System.out.println("Area is: "+0.5*b*h);
          }

          public static void area(int s){
                System.out.println("Area is: "+ (s*s));
          }

}