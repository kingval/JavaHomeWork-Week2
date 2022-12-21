package HomeworkWeek2;
import java.util.Scanner;

public class EligibleCandidateWithInput {

    public static void main(String[] args) {

/*
Write a program to check if a candidate is eligible for voting or not with user input.
Candidate Age must be 18 or greater to vote.
*/
        System.out.println("Enter your Age to check if you are eligible to Vote: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Congratulations, You are eligible to Vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }

    }


}
