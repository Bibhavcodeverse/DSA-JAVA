public class Patternque {
    public static void main(String[] args) {
            for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
    }


    Hollow rectangle
        int n=4;
        int m=5;
// outer loop 
    for(int i=1; i<=n; i++){
        // inner loop
        for(int j=1;j<=m; j++){
            if(i==1 || j==1 || i==n || j==m){
                System.out.print("*");
            }

            else {
                System.out.print(" ");
            }
            
         }
         System.out.println();
          }




// Half paramid 
        int n=4;

        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

         int n =5;
        for(int i=n; i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }

        // inverted half paramid
            // outer loop 
           for(int i=1; i<=n;i++){
            // inner loop-> space print
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop -> star print
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
           }

        // half paramid  with Numbers 

         for (int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
        System.out.println();
         }

         // inverted half paramid with numbers 

        for (int i=n; i>=1; i--){
            for (int j=1; j<=i;j++){
                System.out.print(j);

            }
            System.out.println();

        }



        // Floyd's triangle
        

        int n = 5;  // total number of rows 
        int number=1;
        for (int i=0; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++; // number =number +1;
            }  
            
            System.out.println();
          }
          
          // 0-1 traingle

          int n=5;
          for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;

                if(sum%2==0){
                    System.out.print("1");
                
                }

                else{
                    System.out.print("0");

                }
            }
            System.out.println();
          }

    }
}



