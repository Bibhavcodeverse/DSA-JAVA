import java.util.*;

public class array {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows= sc.nextInt();
        System.out.println("Enter the value of cols: ");
        int cols= sc.nextInt();
        

        int[][] numbers= new int [rows][cols];

        //input
        //rows

        for(int i=0;i<rows;i++){
            //columns

            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();

            }
        }    

        //output

        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+ " ");


            }
            System.out.println();
        }

    }


}
