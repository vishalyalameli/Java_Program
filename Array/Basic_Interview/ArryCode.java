import java.util.*;
class ArryCode {

    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        int arr [] = new int[size];
        int product = 1;
        System.out.println("Enter The Element");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
            product*=arr[i];

        }
        System.out.println("Array");

        for(int i=0; i<arr.length;i++){
           arr[i]=product/arr[i];
            System.out.println(arr[i]);
        }
        sc.close();


    }
    
}
