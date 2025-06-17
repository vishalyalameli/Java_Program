public class StringRepalce {
    public static void main(String [ ]args){
        String str = "My name is Vishal";
        String replcer = str.replace("Vishal", "vikas");

        System.out.println("Original : "+ str);
        System.out.println("Repalce String :" + replcer);
    // OR
        String str1 = "vishal";
        String replacechar = str.replace('l', 'k');

         System.out.println("Original : "+ str1);
        System.out.println("Repalce String :" + replacechar);


    }
    
}

/*
Original : My name is Vishal
Repalce String :My name is vikas

Original : vishal
Repalce String :My name is Vishak

 */