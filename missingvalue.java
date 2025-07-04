public class missingvalue {
    public static void main(String [] args){
        int[] arr = {1, 2, 3, 5};
        
        int missingValue=missingNum(arr,5);
        System.out.println(missingValue);

    }

    public static int missingNum(int[] arr, int n) {
        
        int expected_sum=n*(n+1)/2;
        System.out.println("Expected_sum: "+expected_sum);

        int actual_sum=0;
        for(int i= 0;i<arr.length;i++){
            actual_sum=arr[i]+actual_sum;
            
        }
        System.out.println("actual_sum: "+ actual_sum);
       int missing_value=expected_sum-actual_sum;



        return missing_value;

    //Sum of 1 to n = n * (n + 1) / 2   

    
}
    
}
