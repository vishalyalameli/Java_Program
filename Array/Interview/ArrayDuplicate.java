

public class ArrayDuplicate {
    public static void main(String [ ]args){
        int [] arr= {1,2,3,4,5,6,4,3,2};
        System.out.print("Duplicate Element:");
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1 ; j<arr.length; j++){
                if(arr[i] == arr[j]){
               
                    System.out.print( arr[i]);
                  
                     break;
                }
              
            }
        }
    }
    
}


// 2
// 3
// 4


// import java.util.Arrays;

// public class ArrayDuplicate {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 4, 3, 2};
//         int[] duplicates = new int[arr.length];
//         int index = 0;

//         for (int i = 0; i < arr.length; i++) {
//             boolean alreadyAdded = false;

//             // Check if it's already added
//             for (int k = 0; k < index; k++) {
//                 if (duplicates[k] == arr[i]) {
//                     alreadyAdded = true;
//                     break;
//                 }
//             }

//             // Check if it's a duplicate
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j] && !alreadyAdded) {
//                     duplicates[index++] = arr[i];
//                     break;
//                 }
//             }
//         }

//         // Create a new array with only the found duplicates
//         int[] result = Arrays.copyOf(duplicates, index);

//         System.out.println(Arrays.toString(result));
//     }
// }
