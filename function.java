import java.util.*;



public class function {
//     public static int AddTwoNumber(int a,int b){
//     int sum=a+b;
//     return sum;
// }

    //     public static int CalculateProduct(int a, int b){
    //         int product =a*b;
    //         return product;

    // }
        public static void factorial(int n){
            //loop

            int Factorial=1;

            for(int i=n;i>=1;i--){
                Factorial=Factorial*i;
            }
            System.out.println(Factorial);
            
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the value of a: ");
        System.out.println("Enter the value of n: ");
        int n =sc.nextInt();

        factorial(n);

       // int a =sc.nextInt();

       // System.out.println("Enter the value of b: ");
        //int b=sc.nextInt();

        // int sum= AddTwoNumber(a, b);
        // System.out.println("Sum of 2 number is: "+sum);

       // int Product=CalculateProduct(a,b);

       // System.out.println("Product of the value a*b: " +Product);

        
    }
}

