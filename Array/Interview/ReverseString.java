class ReverseString{
    public static void main(String [ ]args){

        String str = "Vishal";
        StringBuffer sb = new StringBuffer(str);
        System.err.println("");
        sb.reverse();
        str= sb.toString();
        System.err.println(str);
    }
}
//  lahsiV