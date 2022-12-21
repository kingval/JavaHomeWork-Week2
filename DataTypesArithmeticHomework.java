package HomeworkWeek2;
public class DataTypesArithmeticHomework {

    public static void main(String[] args ){

        byte bByte = 20;

        short aShort = 200;
        short bShort = 300;

        int aInt = 1000;
        int bInt = 4000;

        long aLong = 40000000;
        long bLong = 50000000;

        float aFloat = 1.0f;
        float bFloat = 2.0f;

        double aDouble = 9.777;
        double bDouble = 1.777;

        char xChar = 'x' ;  // change this value from 'x' to  'y' to see another outcome for the boolean value.

        boolean aBoolean = true;
        boolean bBoolean = false;

        String aHomeWorkWeek2 = "Week 2 Homework Completed !";

        // Addition
        System.out.println("1.0 + 2.0 =" + (aFloat+bFloat));

        // Subtraction
        System.out.println("40000000 - 50000000 =" + (aLong-bLong));

        // Multiplication
        System.out.println("200 * 300 =" + (aShort*bShort));

        // Division
        System.out.println("9.777 / 1.777 ="  + (aDouble/bDouble));

        // Modulus
        System.out.println("4000 % 1000 =" + (bInt%aInt));  //Done this even though it was not in the table

        // Increment
        System.out.println("Value is 20 ++ Increment value =" + (++bByte));

        // Decrement
        System.out.println("Value is -1000 ++ Decrement value =" + (--aInt));

        // Char & Boolean
        if (xChar=='x') {
            System.out.println(aBoolean);
        } else if (xChar=='y') {
            System.out.println(bBoolean);
        }

        System.out.println(aHomeWorkWeek2);

    }
}

