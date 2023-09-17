package semester1.assaugment1;
// assignment: 1
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        /* gets from user 2 bounds adn return all armstrong numbers between them. */
        /* gets the bounds from user */
        Scanner input = new Scanner(System.in);
        int UpperBound=0, LowerBound=0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the UpperBound:");
            UpperBound = input.nextInt();
            System.out.println("Please enter the LowerBound:");
            LowerBound = input.nextInt();
            if (UpperBound >= LowerBound && UpperBound >= 0 && LowerBound >= 0) break;
            else if (i == 2) {
                System.out.println("Error. failed 3 times");
                return;
            }
            System.out.println("Error, please try again.");
        }

        for(int i = LowerBound;i<UpperBound;i++){
            int numOfDigit = String.valueOf(i).length();
            int sum=0;
            int num=i;
            while (num>0){
                int RightNum=num%10;
                int RightNumSum=RightNum;
                for(int j=1;j<numOfDigit;j++){
                    RightNumSum*=RightNum;
                }
                sum+=RightNumSum;
                num/=10;
            }
            if(i==sum)
                System.out.print(i+",");
        }


    }
}


