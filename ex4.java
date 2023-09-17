package semester1.assaugment1;
// assignment: 1
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args){
        //program that convert numbers from binary to decimal.
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter a non negative binary number with uo to 10 digits:");

        int number = input.nextInt();
        int numberOfDigits=0;
        int number1=number;
        while(number1>0){
            numberOfDigits++;
            number1/=10;
        }
        //check if number is number with 1 digit and handle this particular case.
        if(numberOfDigits==1){
            if(number==0)
            System.out.println(number+"(in base2)=0 (in base 10)");
            else
                System.out.println(number+"(in base 2)=1(in base 10)");
        }else {
            int sumNum=0;
            int hezka=1;
            int finalNumber=number;
            for(int i =0;i<=numberOfDigits;i++){
                sumNum=sumNum+((number%10)*hezka);
                hezka*=2;
                number/=10;

            }
            System.out.println(finalNumber+"(in base 2)="+sumNum+"(in base 10)");
        }
    }
}
