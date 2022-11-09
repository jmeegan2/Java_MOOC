package Part_3;



import java.util.Scanner;

public class Discovering_errors {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int start = Integer.valueOf(scanner.nextLine());
//        int end = Integer.valueOf(scanner.nextLine());
//
//        printValuesFromLargestToSmallest(start,end);

        /*
        Searching for Errors with print Debugging
          Involves adding messages to certain lines of code, the messages are used to follow the flow
          of the program's execution and can also contain values of variables that live in the program
         */
        //Code example of print debugging
        Scanner x = new Scanner(System.in);
//        int values = 0;
//        int sum = 0;
//
//        while (true) {
//            System.out.println("-- values: " + values + ", sum: " + sum);
//
//            System.out.println("Provide a value, a negative value ends the program");
//            int value = Integer.valueOf(scanner.nextLine());
//            if (value < 0) {
//                System.out.println("-- value is a negative, exiting loop");
//                break;
//            }
//
//            values = values + 1;
//            sum = sum + value;
//        }
//
//        System.out.println("-- loop exited");
//        System.out.println("-- values: " + values + ", sum: " + sum);
//
//        if (sum == 0) {
//            System.out.println("The average of the values could not be calculated.");
//        } else {
//            System.out.println("Average of values: " + (1.0 * sum / values));
//        }

        System.out.print("Customer number: ");
        int y = Integer.valueOf(x.nextLine());

        if (y >= 1000 && y % 25 == 0) {
            System.out.println("Gets a gift card!");
        } else if (y % 2000 == 0) {
            System.out.println("Gets a large gift card!");
        } else {
            System.out.println("Gets nothing.");
        }
    }
    //Methods

    public static void printValuesFromTenToOne() {
        int value = 10;
        while (value > 0) {
            System.out.println(value);
            value = value - 1;
        }
    }

    public static void printValuesFromLargestToSmallest(int start, int end) {
        while (start >= end) {
            System.out.println(start);
            start = start - 1;
        }
    }
}

