public class Searchinarray {
    public static void main(String [] args){
        int[] arr={ 1,2,3,4,5,6,7,8,9};
        int target= 5;
        search1(arr, target);

    }
    public static int search1(int[] arr,int target){
        if(arr.length==0){
            return 0;

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Our matched number is: "+ target+ " "+"at index: "+arr[i]);
                return target;
                
            }

        }
        return -1;
    }
    
}
