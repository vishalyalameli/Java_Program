class PrePost{
    public static void main(String [] args){
        int a= 10;
        System.out.println(a++);
        System.out.println(++a);
    }
}

// 10
// 12
/*
 a++ prints 10 (post-increment: first use, then increment).

++a prints 12 (x is now 11, then pre-increment to 12).
 */