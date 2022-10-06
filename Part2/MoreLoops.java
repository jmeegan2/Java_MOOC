package Part2;

import java.util.Scanner;
import java.util.SortedMap;

public class MoreLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // while loop with condition

//        int number = 1;
//
//        while (number < 6) {
//            System.out.println(number);
//            number++;
//        }
//

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        // Counting
//        System.out.println("Give a number: ");
//        int numGiven = Integer.valueOf(scanner.nextLine());
//
//        for (int i = 0; i <= numGiven; i++ ) {
//            System.out.println(i);
//        }

        //Counting to hundred
//        System.out.println("Give number: ");
//        int numGiven = Integer.valueOf(scanner.nextLine());
//
//        for (int i = numGiven; i <= 100; i++) {
//            System.out.println(i);
//        }

        //From where to where

//        System.out.println("Where to? ");
//        int numGivenTo = Integer.valueOf(scanner.nextLine());
//        System.out.println("Where from? ");
//        int numGivenFrom = Integer.valueOf(scanner.nextLine());
//
//        for (int i = numGivenFrom; i <= numGivenTo; i++){
//            if (numGivenTo > numGivenFrom) {
//                System.out.println(i);
//            } else {
//                break;
//            }
//        }

        // Sum of a sequence
//        System.out.println("Last number? ");
//        int number = Integer.valueOf(scanner.nextLine());
//        int sum = 0;
//        for (int i = 1; i <= number; i++) {
//           sum += i;
//        }
//        System.out.println("The sum is " + sum);

        // Sum of a sequence - the sequel

//        System.out.println("First number? ");
//        int firstNum = Integer.valueOf(scanner.nextLine());
//        System.out.println("Last NUmber? ");
//        int lastNum = Integer.valueOf(scanner.nextLine());
//        int sum = 0;
//
//        for (int starting = firstNum; starting <= lastNum; starting++) {
//            sum += starting;
//        }
//        System.out.println("The sum is: " + sum);

        //Factorial
//        System.out.println("Give a number");
//        int number = Integer.valueOf(scanner.nextLine());
//        int factorial = 1;
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//            System.out.println("Factorial " + factorial);
//
//

        // Repeating, breaking and remembering (5 parts)

    // Part 1: Reading
        System.out.println("Give numbers: ");
        int sum = 0;
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num != -1) {
                sum += num;
            }
            else {
                System.out.println("Thx bye!");
                System.out.println("Sum: "+ sum);
                break;
            }
        }




     }
    }




