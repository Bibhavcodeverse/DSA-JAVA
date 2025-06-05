public class advancedpattern {
    public static void main(String[] args) {
        // Butterfly pattern 

        //int n=5;

        //First half--- upper half


        // for(int i=1; i<=n;i++){
        //     // 1st part

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");

        //     }

        // //space 

        // int spaces= 2*(n-i);
        // for(int j=1; j<=spaces;j++){
        //     System.out.print(" ");

        // }

        // //2nd part 

        // for (int j=1; j<=i;j++){
        //     System.out.print("*");
        // }

        // System.out.println();
        // }

        // // lower half

        // for(int i=n; i>=1;i--){
        //     // 1st part

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");

        //     }

        // //space 

        // int spaces= 2*(n-i);
        // for(int j=1; j<=spaces;j++){
        //     System.out.print(" ");

        // }

        // //2nd part 

        // for (int j=1; j<=i;j++){
        //     System.out.print("*");
        // }

        // System.out.println();
        // }



    
    //}

    //  Solid Rhombus

    // int n=5;
    // for(int i=1;i<=n;i++){
    //     // spaces 
    //     for(int j=1; j<=n-i;j++){
    //         System.out.print(" ");

    //     }

    //     for(int j=1; j<=5;j++){
    //         System.out.print("*");
    //     }

    //     System.out.println();

    // }

        // number pyaramid  
    // int n=5;
    // for(int i=1; i<=n;i++){
    //     // spaces
    //     for(int j=1;j<=n-i; j++){
    //         System.out.print(" ");

    //     }
    //     // number
    //     for(int j=1;j<=i;j++){
    //         System.out.print(i+" ");
    //     }
    //     System.out.println();
    // }

    // palindromic pattern

     int n=5;
     for(int i=1; i<=n;i++){
        //space
        for(int j=1;j<=n-1;j++){
            System.out.print(" ");

        }

        //1st half numbers

        for(int j=i;j>=1;j--){
            System.out.print(j);
        }

        //2nd half
        for(int j=1;j<=i;j++){
            System.out.print(j);

        }
        System.out.println();
     }

     // Diamond pattern
    //    int n = 4;

    //     // Upper half of the diamond
    //     for (int i = 1; i <= n; i++) {
    //         // Print spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }

    //         // Print stars
    //         for (int j = 1; j <= 2 * i - 1; j++) {
    //             System.out.print("*");
    //         }

    //         // Move to next line
    //         System.out.println();
    //     }

    //     // Lower half of the diamond
    //     for (int i = n - 1; i >= 1; i--) {
    //         // Print spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }

    //         // Print stars
    //         for (int j = 1; j <= 2 * i - 1; j++) {
    //             System.out.print("*");
    //         }

    //         // Move to next line
    //         System.out.println();
    //     }
}

}
    
