import java.util.ArrayList;

class ArrayOddEvenNumSep {
    public static void main(String [] args){
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer>oddList = new ArrayList<>();

        for(int num : array){
            if(num % 2 == 0){
                evenList.add(num);
            }else{
                oddList.add(num);
            }
        }

        System.out.println("Even Number" + evenList);
        System.out.println("Odd Number" + oddList);
    }
    
}
