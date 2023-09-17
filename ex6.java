package semester1.assaugment1;
// assignment: 1
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        /* get 3 colors from user and return a color out of three of them. */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first color:");
        char color1 = input.next().charAt(0);
        System.out.println("Please enter the second color:");
        char color2 = input.next().charAt(0);
        System.out.println("Please enter the third color:");
        char color3 = input.next().charAt(0);
        /* check if the colors we got from user is good. */
        if((color1!='r' && color1!='g' && color1!='b')||( color2!='r' && color2!='g' && color2!='b' )||( color3!='r' && color3!='g' && color3!='b')){
            System.out.println("Error in input");
        }else{
            /* giving the colors int presentation ill can use switch case */
            int num1, num2,num3;
            if(color1=='r') {
                num1=1;
            } else if (color1=='g') {
                 num1=10;
            }else {
                 num1=100;
            }
            if(color2=='r') {
                 num2=1;
            } else if (color2=='g') {
                 num2=10;
            }else {
                 num2=100;
            }
            if(color3=='r') {
                 num3=1;
            } else if (color3=='g') {
                 num3=10;
            }else {
                 num3=100;
            }
            switch (num1+num2+num3){
                case 3:
                    System.out.println(color1 + "+" + color2 +"+"+ color3 +" gives the color red");break;
                case 30:
                    System.out.println(color1 + "+" + color2 + "+" + color3 + " gives the color green");break;
                case 300:
                    System.out.println(color1 + "+" + color2 + "+" + color3 + " gives the color blue");break;
                case 12:
                case 21:
                    System.out.println(color1 + "+" + color2 + "+" + color3 + " gives the color yellow");break;
                case 102:
                case 201:
                    System.out.println(color1 + "+" + color2 + "+" + color3 + " gives the color magenta");break;
                case 210:
                case 120:
                    System.out.println(color1 + "+" + color2 + "+" + color3 + " gives the color cyan");break;
                case 111:
                    System.out.println(color1 + "+" + color2 + "r+" + color3 + " gives the color white");break;

            }

        }

    }
}
