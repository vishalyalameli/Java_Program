public class StringLength {
    public static void main(String[] args) {
        int i = 0;
        String str = "Vishal";
        char ch[] = str.toCharArray();
        for (char c : ch) {
            i++;

        }
        System.out.println("Length of the String:" + i);
    }

}
