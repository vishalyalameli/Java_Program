
import java.util.Arrays;

public class SortString {

    public static void main(String [] args){
        String [] name = {"Amit", "Vishal", "Akash" , "Vilas" ,"Bajaja"};

        Arrays.sort(name);

        System.out.println(" Sorted the String");

        for(String names : name){
            System.out.println(names);
            
        }

    }
    
}

