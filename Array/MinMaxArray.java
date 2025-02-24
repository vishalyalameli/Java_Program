public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        int min = arr[0], max = arr[0];
        
        // for (int num : arr) {//
        //     if (num < min) min = num;//
        //     if (num > max) max = num;//
        // }//
        
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}

// Smallest: -1
// Largest: 8
