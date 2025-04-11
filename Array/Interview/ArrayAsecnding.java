import java.util.Arrays;

public class ArrayAsecnding {
    public static void main(String [ ]args){

        int [] arr = {5,2,9,1,10};
        for(int i = 0 ; i<arr.length-1; i++){
            for(int j = 0 ; j<arr.length-i-1; j++){
                if(arr[j]> arr[j +1]){                  // (arr[j]> arr[j +1]) Descending Array
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j +1] =temp;


                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Bubbole sort Program 
// Sorting Algorithms

// [1, 2, 5, 9, 10]