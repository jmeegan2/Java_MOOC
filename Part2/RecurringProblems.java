package Part2;

import java.util.Scanner;

public class RecurringProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter a num to be squared");
//        int num = Integer.valueOf(scanner.nextLine());
//
//        int squareValue = num * num;
//        System.out.println("The square of the number " + num + " is " + squareValue);

        //Square root of sum
//        System.out.println("Give two integers: ");
//        int int1 = Integer.valueOf(scanner.nextLine());
//        int int2 = Integer.valueOf(scanner.nextLine());
//
//        double squareRoot = Math.sqrt((int1 + int2));
//
//        System.out.println("Square root of sum: " +squareRoot);

        //Absolute value
//


        //Comparing Numbers
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
                System.out.println(num1 + " is smaller than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }

    }
}
