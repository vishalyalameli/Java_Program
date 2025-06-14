import java.util.Arrays;
class ArrayProgram {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 7, 8, 1, 10 };

        Arrays.sort(arr);

        int smallest = arr[0];
        int largest = arr[arr.length - 1];

        int SecondSmallest = -1;
        int SecondLargest = -1;

        for (int i = 1; i <= arr.length; i++) {
            if (arr[i] != smallest) {
                SecondSmallest = arr[i];
                break;
            }
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                SecondLargest = arr[i];
                break;
            }

        }
        System.out.println("Secondsmallest:" + SecondSmallest);
        System.out.println("SecondLarget:" + SecondLargest);
    }

}


/*
  So why - 2?
Let’s say you want to start from the second last element in the array.

The last element is at index arr.length - 1

The second last element is at index arr.length - 2
Expression	What It Gives
arr.length	Total number of elements
arr.length - 1	Index of the last element
arr.length - 2	Index of the second last e

⚠️ Special Case: All Same Values
If the array was:

java
Copy
Edit
int[] arr = {2, 2, 2, 2};
Then:

smallest = 2

largest = 2

And the loops would not find any other number ≠ 2.

Result:

java
Copy
Edit
secondSmallest = -1
secondLargest = -1


 */