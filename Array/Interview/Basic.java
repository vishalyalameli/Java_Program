public class Basic {
    public static void main(String [] args){

    //    int a = 1 ;
    //    int b = 0 ;

    //     if((a+b) * (a-b) == 1){
    //         System.out.println("true");
    //     }else{
    //         System.out.println("false");
    //     }

    boolean a = true ;
    boolean b = false ;

     if((a | b) & (a ^ b) == true){       // ( 1 | 0 ) = 1  ( 1 ^ 0 ) 
         System.out.println("true");
     }else{
         System.out.println("false");
     }


    }
    
}
