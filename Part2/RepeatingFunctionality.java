package Part2;

import java.util.Scanner;
import java.util.SortedMap;

public class RepeatingFunctionality {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Exit? (y exits) ");
//            String input = scanner.nextLine();
//            if(input.equals("y")) {
//                break;
//            }
//
//            System.out.println("Ok! Let's carry on!");
//        }
//
//        System.out.println("Ready!");

        //Carry on?
//        while (true) {
//            System.out.println("Shall we carry on? ");
//            String input = scanner.nextLine();
//            if (input.equals("no")) {
//                System.out.println("You've entered no, now breaking out the while loop and ending it");
//                break;
//            }

        //Are we there yet
//        while (true) {
//            System.out.println("Give a number: ");
//            int num = Integer.valueOf(scanner.nextLine());
//            if (num == 4) {
//                System.out.println("You entered 4 now breaking the while loop");
//                break;
//            }

//        while (true) {
//            System.out.println("Insert positive integers: ");
//            int number = Integer.valueOf(scanner.nextLine());
//
//            if (number <= 0) {
//                System.out.println("Unfit number! Try again.");
//                continue; //Will continue at start of the while loop once triggered
//            }
//
//            System.out.println("Your input was " + number);
//
//        }

//
//        while (true) {
//            System.out.println("0");
//        }
//        int numbersRead = 0;
//        int sum = 0;
//
//        while (true) {
//            if (numbersRead == 5) {
//                break;
//            }
//
//            System.out.println("Input number");
//            sum = sum + Integer.valueOf(scanner.nextLine());
//            numbersRead = numbersRead + 1;
//        }
//
//        System.out.println("The sum of the numbers is " + sum);

//
//        int number = Integer.valueOf(scanner.nextLine());
//
//        while (true) {
//            number = number + 1;
//
//            if (number >= 5) {
//                break;
//            }
//
//            if (number < 5) {
//                continue;
//            }
//
//            System.out.print(number + " ");
//        }
//
//        System.out.print(number + " ");
//
//    }


        // only positives
//        while (true) {
//            System.out.println("Give a number: ");
//            int number = Integer.valueOf(scanner.nextLine());
//            if (number < 0) {
//                System.out.println("Unsuitable number");
//                continue;
//            } else if (number > 0) {
//                int squared = number * number;
//                System.out.println(squared);
//                continue;
//            } else if (number == 0) {
//                break;
//            }
//        }

        //Another way of doing same thing with one less if statement

        //The while loop is a block of code
//        while (true) {
//            System.out.println("Input a number: ");
//            int number = Integer.valueOf(scanner.nextLine());
//
//            if (number == 0) {
//                break;
//            } else if (number < 0) {
//                System.out.println("Unfit number");
//                continue;
//            }
//
//            System.out.println(number * number);
//        }

        // task to keep track of number of ones
//        int ones = 0;
//
//        // the task is to read an input from the user
//        while (true) {
//            System.out.println("Give a number (end with 0): ");
//            // the task is to read a user inputted number
//            int number = Integer.valueOf(scanner.nextLine());
//
//            // The task is to exit the loop if the user
//            // has inputted zero
//            if (number == 0) {
//                break;
//            }
//
//            // The task is to increase the amount of ones
//            // if the user inputs a number one
//            if (number == 1) {
//                ones = ones + 1;
//            }
//        }
//
//        // The task is to print out the total of ones
//        System.out.println("The total of ones: " + ones);


        //Number of numbers
        // nice implementation, very sleek
        int amountOfEntries = 0;

        while (true) {
            System.out.println("Give a number: ");
            int entry = Integer.valueOf(scanner.nextLine());
            if (entry != 0) {
                amountOfEntries++;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: " + amountOfEntries);
    }
}
