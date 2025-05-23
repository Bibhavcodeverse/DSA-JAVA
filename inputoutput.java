import java.util.*;

public class inputoutput {
    public static void main (String[] args){
        //output
        System.out.println("Hello World with java");
        // variables 
        //int a= 10;
        //int b= 20;
        //int sum= a+b;
        //System.out.println("Sum of a+b=" + sum);

         Scanner sc= new Scanner(System.in);
         //String name =sc.nextLine();
         //System.out.println(name);
         System.out.println("Enter the value of a: ");
         int a= sc.nextInt();
         System.out.println("Enter the value of b: ");
         int b= sc.nextInt();

         int Sum =a+b;

         System.out.println(Sum);
    }
    

}
