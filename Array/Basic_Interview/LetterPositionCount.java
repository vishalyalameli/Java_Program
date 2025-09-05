public class LetterPositionCount {

    public static void main(String args[]) {

        String s = "CANDIDJAVA";
        char[] a = s.toCharArray();
        int i = 1;
        {
            for (char output : a) {

                System.out.print(output + " " + i + " ");
                i++;

            }
        }
 
    }
}

// O/P: C 1 A 2 N 3 D 4 I 5 D 6 J 7 A 8 V 9 A 10