package Part2;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallerParts {
    public static void main(String[] args) {

//        int answer =  greatest(2, 7, 3);
//        System.out.println("Greatest: " + answer);
//        int answer = smallest(2,7);
//        System.out.println("Smallest: " + answer);
//        int answer = sum(4, 3, 6, 1);
//        System.out.println("Sum: " + answer);
//        int number = numberUno();
//        System.out.println(number);
//
//        String word = word();
//        System.out.println(word);


        // For the return value from the method to be used it must be stored in a variable in main scope
//       int number = alwaysReturnsTen();
//        System.out.println(number);
//        division(3,5);
        // Method means a named set consisting of statements that can be called from elsewhere in the program by its own
        // name. Programming languages come with pre-made methods like sout

        //Parameters are values given to a method that can be used in it execution
        /*
        In the following example a parameterized method greet is defined. It has an int type parameter called numOfTimes.

            public static void greet(int numOfTimes) {
             int i = 0;
             while (i < numOfTimes) {
                    System.out.println("Greetings!");
                    i++;
                 }
}


         */
        Scanner scanner = new Scanner(System.in);

//        sum(4,5);
//        printFromNumberOne(5);
//        printUntilNumber(1);


//        // In a hole in the ground method call, extended
//        System.out.println("How many times?");
//        int amount = Integer.valueOf(scanner.nextLine());
//        for(int i = 0; i != amount; i++) {
//            printText();
//        }


//        System.out.println("Lets try if we can travel to the method world:");
//        // After reading greet it will jump to the method outside the main then come back and proceed to the next line
//        // until next greet method is read
//        greet();
//
//        System.out.println("\nLooks like we can, lets try again: ");
//        greet();
//        greet();
//        greet();

    }
//Method for division
//    public static void division(int numerator, int denominator) {
//        double result = ((double) numerator)/ denominator;
//        System.out.println(result);
//
//    }

    // Method for divisible by three
//    public static void divisibleByThreeInRange(int beginning, int end) {
//        //Prints all the numbers divisible by three in the given range
//        for (int i = beginning; i <= end; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }
//    }

    //Averaging


    //greatest method, just used if else statements could have ternary operator but this is easier to read
    public static int greatest(int number1, int number2, int number3){
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2 ;
        } else {
            return number3;
        }
    }

    //smallest method

    public static int smallest(int numOne, int numTwo) {
        int smallest;
        if (numOne < numTwo) {
            smallest = numOne;
        } else {
            smallest = numTwo;
        }
        return smallest;
    }

    //Expanding the method sum
//    public static int sum(int number1, int number2, int number3, int number4) {
//       int sum = number1 + number2 + number3 + number4;
//       return sum;
//    }


    //Method for returning a String
//    public static String word() {
//        return "Hello";
//    }
//
//    //Method for returning the value one
//    public static int numberUno(){
//        return 1;
//    }

    // Method for returning 10
//    public static int alwaysReturnsTen() {
//        return 10;
//    }



}




    //Method for "From one to parameter

//    public static void printUntilNumber(int number) {
//        int counter = 0;
//        for(int i = 1; i <= number;i++) {
//            counter++;
//            System.out.println(counter);
//
//        }
//    }
    // from parameter to one exercise
//    public static void printFromNumberOne(int num) {
//
//       int initialNum = num;
//        for(int i = 0; i < initialNum; i++){
//            System.out.println(num);
//            num--;
//        }
//
//    }


//    public static void sum(int first, int second) {
//        System.out.println("The sum of numbers " + first + " + " + second + " = " + (first + second));
//    }
//
//    }

    // Method for "In a hole in the ground exercise
//    public static void printText(){
//        System.out.println("In a hole in the ground there lived a method");
//    }





//        // own methods
//        public static void greet() {
//            System.out.println("Greetings from method world");



