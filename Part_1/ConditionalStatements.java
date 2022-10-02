package Part_1;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Speed ticket generator
//        System.out.println("Give Speed: ");
//        int speed = Integer.valueOf(scanner.nextLine());
//
//        if (speed > 120) {
//            System.out.println("You are receiving a speeding ticket good sir. ");
//        } else {
//            System.out.println("Speed the fuck up. ");
//        }

        // Orwell Generator

//        System.out.println("Give integer: ");
//        int integer = Integer.valueOf(scanner.nextLine());
//
//        if (integer == 1984) {
//            System.out.println("Orwell ");
//        } else {
//            System.out.println("Not Orwell");
//        }

        // Ancient
//        System.out.println("Give year: ");
//        int year = Integer.valueOf(scanner.nextLine());
//
//        if (year < 2015) {
//            System.out.println("Ancient History!! ");
//        } else {
//            System.out.println("Not so ancient");
//        }

        //Positivity checker
//        System.out.println("Give a number: ");
//        int num = Integer.valueOf(scanner.nextLine());
//
//        if (num > 0) {
//            System.out.println("The number is positive.");
//        } else if (num < 0) {
//            System.out.println("The number is negative");
//        } else {
//            System.out.println("The number is 0");
//        }

        //Adulthood
//        System.out.println("How old are you? ");
//        int age = Integer.valueOf(scanner.nextLine());
//        if (age < 18) {
//            System.out.println("You're not an adult");
//        } else {
//            System.out.println("You are an adult");
//        }


        //Larger than or equal two
//        System.out.println("Give first number: ");
//        int numFirst = Integer.valueOf(scanner.nextLine());
//        System.out.println("Give second number: ");
//        int numSecond = Integer.valueOf(scanner.nextLine());
//
//        if (numFirst > numSecond) {
//            System.out.println("Greater number is " + numFirst);
//        } else if (numSecond > numFirst) {
//            System.out.println("Greater number is " + numSecond);
//        } else {
//            System.out.println("The numbers are equal");
//        }

//    //Grading and Points
//        System.out.println("Give points [0-100] ");
//        int grade = Integer.valueOf(scanner.nextLine());
//        if ( grade < 0 ) {
//            System.out.println("Impossible!");
//        } else if ( grade < 50 && grade > 0) {
//            System.out.println("Failed");
//        } else if ( grade >= 50 && grade < 60) {
//            System.out.println("1");
//        }
//        else if ( grade >= 60 && grade < 70) {
//            System.out.println("2");
//        }
//        else if ( grade >= 70 && grade < 80) {
//            System.out.println("3");
//        }
//        else if ( grade >= 80 && grade < 90) {
//            System.out.println("4");
//        }
//        else if ( grade >= 90 && grade <= 100) {
//            System.out.println("5");
//        }  else if ( grade > 100) {
//            System.out.println("Incredible");
//        }

//        for (int grade = -11; grade <= 101; grade++) {
//            grade = grade + 10;
//            if ( grade < 0 ) {
//                System.out.println("Impossible!");
//            } else if ( grade < 50 && grade > 0) {
//                System.out.println("Failed");
//            } else if ( grade >= 50 && grade < 60) {
//                System.out.println("1");
//            }
//            else if ( grade >= 60 && grade < 70) {
//                System.out.println("2");
//            }
//            else if ( grade >= 70 && grade < 80) {
//                System.out.println("3");
//            }
//            else if ( grade >= 80 && grade < 90) {
//                System.out.println("4");
//            }
//            else if ( grade >= 90 && grade <= 100) {
//                System.out.println("5");
//            }  else if ( grade > 100) {
//                System.out.println("Incredible");
//            }
//        }



        //Odd or even
//        System.out.println("Give a number: ");
//        int number = Integer.valueOf(scanner.nextLine());
//        if ( number % 2 == 0) {
//            System.out.println("The number is even");
//        } else{
//            System.out.println("The number is odd");
//        }

//        for( int number = 0; number <= 100; number++) {
//            if ( number % 2 == 0) {
//                System.out.println("The number " + number + " is even");
//            } else{
//                System.out.println("The number " + number + " is odd");
//            }
//        }

        //Password
//        System.out.println("Password?");
//        String password = "Caput Draconis";
//        String passwordEntered = scanner.nextLine();
//        if (passwordEntered.equals(password)) {
//            System.out.println("Welcome");
//        } else {
//            System.out.println("Off with you! ");
//        }

        //Same
//        System.out.println("Input two strings");
//        String one = scanner.nextLine();
//        String two = scanner.nextLine();
//
//        if (one.equals(two)) {
//            System.out.println("Same");
//        } else {
//            System.out.println("Different");
//        }


        //Checking the age
//        System.out.println("How old are you? ");
//        int age = Integer.valueOf(scanner.nextLine());
//        if ( age >=0 && age <= 120) {
//            System.out.println("Ok");
//        } else {
//            System.out.println("Impossible!");
//        }

        //Leap year
//        System.out.println("Give a year: ");
//        int year = Integer.valueOf(scanner.nextLine());
//        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
//            System.out.println("This year is a leap year");
//        } else {
//            System.out.println("This year is not a leap year");
//        }

        //Gift tax
        System.out.println("Value of Gift?");
        int giftValue = Integer.valueOf(scanner.nextLine());
        if (giftValue < 5000) {
            System.out.println("No tax!") ;
        } else if (giftValue >= 5000 && giftValue < 25000) {
            double taxOwed = (100 + (giftValue - 5000) * 0.08);
            System.out.println("Tax: " + taxOwed);
        } else if (giftValue >= 25000 && giftValue < 55000) {
            double taxOwed = (1700 + (giftValue - 25000) * 0.10);
            System.out.println("Tax: " + taxOwed);
        } else if (giftValue >= 55000 && giftValue < 200000) {
            double taxOwed = (4700 + (giftValue - 55000) * 0.12);
            System.out.println("Tax: " + taxOwed);
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            double taxOwed = (22100 + (giftValue - 200000) * 0.15);
            System.out.println("Tax: " + taxOwed);
        } else if (giftValue >= 1000000) {
            double taxOwed = (142100 + (giftValue - 100000) * 0.17);
            System.out.println("Tax: " + taxOwed);
        }

        /*
       Comparison Operators
        > greater than
        >= greater than or equal to
        < less than
        <= less than or equal to
        == equal to
        != not equal to

         */
    }
}
