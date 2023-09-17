package semester1.assaugment1;
import java.util.Scanner;
// assignment: 1
// Author: Michael Kupfer , ID: 209493246
import static java.lang.Math.abs;
import static java.lang.Math.max;

public class ex3 {
    //gets 3 length of edges of triangle and return statements about it.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter lengths of three edges (the last one is the biggest) : ");
        float edge1 = in.nextFloat();
        float edge2 = in.nextFloat();
        float edge3 = in.nextFloat();

        //check about negative size
        if (edge1 < 0 || edge2 < 0 || edge3 < 0) {
            System.out.println("Error");
        } else if ((edge1 + edge2 > edge3) && (edge3 + edge2 > edge1) && (edge3 + edge1 > edge2)) {
            if (edge1 != edge2 && edge1 != edge3 && edge2 != edge3) {
                System.out.println("scalene triangle.");
            } else if (edge2 == edge1 && edge1 == edge3) {
                System.out.println("equilateral triangle.");
            } else if ((edge1 == edge2) && (edge1 != edge3) || (edge1 == edge3) && (edge1 != edge2))
                System.out.println("isosceles triangle.");
        }else
            System.out.println("We can not make a triangle from these edges.");
    }
}