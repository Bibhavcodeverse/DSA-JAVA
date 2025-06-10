import java.util.*;
public class Strings {
    public static void main(String [] args){
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the name: ");

        // String name = sc.next();

        // System.out.println("Your name is:" + name);


        //concatenation

        String firstName ="Tony";
        String LastName="Stark";
        String FullName=firstName+" " +LastName;
        // System.out.println(FullName);
        // System.out.println(FullName.length());


        // // charAt
        // for(int i=0;i<FullName.length();i++){
        //     System.out.println(FullName.charAt(i));
        // }

        //compare

        if(firstName.compareTo(FullName)==0){
            System.out.println("Strings are same");

        }
        else{
            System.out.println("Strings are not equal");
        }

        String sentence="My name is Bibhav Kumar";

        String name=sentence.substring(11,17);
        System.out.println(name); 
    }



    
}
