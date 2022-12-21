package HomeworkWeek2;
import java.util.Scanner;
public class CheckEvenOddNumberWithInput {

        public static void main(String[] args) {
/*
Write a program to check given number is even or odd with user input.
*/

            System.out.println("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if(num%2==0){
                System.out.println(num + ": Number is Even.");
            }
            else {
                System.out.println(num + ": Number is Odd.");
            }

        }

    }
