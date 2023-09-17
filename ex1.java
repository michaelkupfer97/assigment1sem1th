package semester1.assaugment1;
import java.util.Scanner;
// assignment: 1
// Author: Michael Kupfer , ID: 209493246
public class ex1 {
    //program that gets from user exchange rate and sum of USD and return sum in NIS.
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println( "Please enter an exchange rate:");
        double rate = in.nextDouble();
        System.out.println( "Please enter the sum in USD:");
        double sum = in.nextDouble();
        double NISsum=rate*sum;
        System.out.println( "Up-to-date UDS-NIS equivalency:"+sum+"USD = "+ NISsum+" NIS.");

    }
}
