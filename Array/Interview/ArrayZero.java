 class ArrayZero {
    public static void main(String[] args){
        int [] arr = { 1,0,5,0,4,0};
        int  n = arr.length;

        for(int i = 0 ; i<n ; i++){
            if(arr[i] != 0){
                System.out.println(arr[i] + " ");
            }
        }

        for(int i = 0; i<n ; i++){
            if(arr[i] == 0){
                System.out.println(0+ " ");
            }
        }
    }
    
}
