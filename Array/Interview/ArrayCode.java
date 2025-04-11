public class ArrayCode {
    public static void main(String [] args){

        int[] arr = {1,2,3,4,1,2,5};
        int Max  = arr[0], Min =arr[0], Sum= 0;

        for(int num : arr){
            if(num < Max) Max =num;
            if(num > Min) Min = num;
            Sum = Sum+ num;
        }

        System.out.println("Max: "+ Max+ "Min :" + Min + "Sum :" + Sum);
    }
    
}
