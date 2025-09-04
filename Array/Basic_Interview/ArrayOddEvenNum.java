
public class ArrayOddEvenNum {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int[] count = countOddAndEven(array);

        System.out.println("Even number :" + count[1]);
        System.out.println("Odd number :" + count[0]);
    }

    public static int[] countOddAndEven(int[] array) {
        int[] count = new int[2];
        for (int num : array) {
            if (num % 2 == 0) {
                count[1]++;

            } else {
                count[0]++;
            }
        }
        return count;

    }

}

/*
 * Even number :5
 * Odd number :5
 */

class EvenAndOdd {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int even_count = 0;
        int odd_count = 0;

        System.out.println("Odd Number : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {

                System.out.println(array[i] + " ");
                odd_count++;

            }
        }

        System.out.println("Odd Number:" + odd_count);

        System.out.println(" Even Number : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " ");
                even_count++;

            }
        }
        System.out.println(" Even Number:" + even_count);

    }
}

/*
 Output:

Odd Number : 
1 
3 
5 
7 
9 
11 
Odd Number:6
 Even Number : 
2 
4 
6 
8 
10 
 Even Number:5
 */