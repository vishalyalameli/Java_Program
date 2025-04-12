
import java.util.Scanner;

public class YearToDays {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Days");

        int days = sc.nextInt();

        int years = days /365;

        days %= 365;

        int month = days/30;

        days %= 30 ;


        System.out.println( years +"years ," +month +"month," + days+ "days");




    }
                                               
}

// Enter Days
// 365
// 1years ,0month,0days