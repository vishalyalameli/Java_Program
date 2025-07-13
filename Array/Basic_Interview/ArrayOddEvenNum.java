

public class ArrayOddEvenNum {
    public static void main(String [] args){
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int []  count = countOddAndEven(array);

        System.out.println("Even number :" + count [1]);
        System.out.println("Odd number :" + count [0]);
    }
    public static int[] countOddAndEven(int [] array){
        int [] count = new int[2];
        for(int num :array){
            if(num % 2 == 0){
                count[1]++;

            }else{
                count[0]++;
            }
        }
        return count;

    }
    
}

/*
Even number :5
Odd number :5
 */