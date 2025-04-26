class ReverseString{
    public static void main(String [ ]args){

        String str = "Vishal";
        StringBuffer sb = new StringBuffer(str);
        System.out.println("");
        sb.reverse();
        str= sb.toString();
        System.out.println(str);
    }
}
//  lahsiV