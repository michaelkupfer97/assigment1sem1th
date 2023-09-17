package semester1.assaugment1;
// assignment: 1
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        /* get size and symbol and printing the symbol with size on size. */
        Scanner input = new Scanner(System.in);
        /* check the size */
        System.out.println("Please enter a size over 0 and under 100:");
        int size = input.nextInt();
        if (size > 100 || size < 0) {
            do {
                System.out.println("please enter new size :");
                size = input.nextInt();
            } while (size > 100 || size < 0);
        }
        /* check the symbol */
        System.out.println("Please enter your symbol(not - #):");
        char symbol = input.next().charAt(0);
        if (symbol == '#') {
            do {
                System.out.println("please enter another symbol :");
                symbol = input.next().charAt(0);
            } while (symbol == '#');
        }
        /* loop of printing */
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j <size ; j++) {
                if (i == j || j==size-1-i) {
                    System.out.print(symbol);
                } else System.out.print('*');
            }
            System.out.println(" ");
        }
    }
}
