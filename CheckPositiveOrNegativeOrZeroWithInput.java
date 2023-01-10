package HomeworkWeek2;
import java.util.Scanner;
public class CheckPositiveOrNegativeOrZeroWithInput {


    public static void main(String[] args) {

/*
Write a input program to check if the number is Positive or Negative or Zero.
*/
        System.out.println("Enter the number to check if it is Positive or Negative or Zero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(": This is a Positive number.");
        }
        else if (num < 0) {
            System.out.println(": This is a Negative number.");
        }
        else {
            System.out.println("The number is zero.");
        }
    }
}

