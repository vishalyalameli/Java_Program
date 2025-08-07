 class  fibonic{
    public static void main(String[] args) {
        
        int limit = 6;
        int a= 0, b = 1;

        System.out.println("Fiboaci" + limit + " ");
        while(a<=limit){
            System.out.print(a+" ");
            int next = a + b;
            a= b ;
            b= next;

        }

    }
    
}

/*
 Fiboaci6 
0 1 1 2 3 5 
 */