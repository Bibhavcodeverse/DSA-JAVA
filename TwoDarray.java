import java.util.*;
public class TwoDarray {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols=sc.nextInt();
        int [][] numbers=new int[rows][cols];

        for(int i=0;i<rows;i++){

            //column
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();

            
            }
            System.out.println();

        }
        int x =sc.nextInt();
        for(int i=0;i<rows;i++){
            //column

            for(int j=0;j<cols;j++){

                //compare with x
                if(numbers[i][j]==x){
                System.out.print("x found at location ( " +i+ ","+j+")");
                }
            }
            
        }
    }
    
}
