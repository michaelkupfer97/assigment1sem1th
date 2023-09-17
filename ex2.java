package semester1.assaugment1;
// assignment: 1
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;
public class ex2 {
    //program that gets distance from user and return number of diffrent lenght of pips.
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println( "Please enter the distance:");
        double distance = in.nextDouble();
        int pipe10M=0;
        int pipe5M=0;
        int pipe1M=0;
        int pipe25CM=0;
        int pipe5CM=0;
        int pipe1CM=0;

        while(distance>10){
            pipe10M++;
            distance-=10;
        }
        if(distance>5){
            pipe5M++;
            distance-=5;
        }
        while(distance>1){
            pipe1M++;
            distance-=1;
        }
        while(distance>0.25){
            pipe25CM++;
            distance-=0.25;
        }
        while(distance>0.05){
            pipe5CM++;
            distance-=0.05;
        }
        while(distance>=0){
            pipe1CM++;
            distance-=0.01;
        }
        System.out.println( "Pipes we need for the line:");
        System.out.println( "Pipes of lenght 10 meter:"+pipe10M+" unites");
        System.out.println( "Pipes of lenght 5 meter:"+pipe5M+" unites");
        System.out.println( "Pipes of lenght 1 meter:"+pipe1M+" unites");
        System.out.println( "Pipes of lenght 25 cm:"+pipe25CM+" unites");
        System.out.println( "Pipes of lenght 5 cm:"+pipe5CM+" unites");
        System.out.println( "Pipes of lenght 1 cm:"+pipe1CM+" unites");

    }
}
