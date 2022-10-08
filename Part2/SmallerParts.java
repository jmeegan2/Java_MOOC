package Part2;

import java.util.Scanner;

public class SmallerParts {
    public static void main(String[] args) {
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

        printFromNumberOne(5);
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
    public static void printFromNumberOne(int num) {

        for(int i = 0; i < num; i++){



        }
    }



    }

    // Method for "In a hole in the ground exercise
//    public static void printText(){
//        System.out.println("In a hole in the ground there lived a method");
//    }





//        // own methods
//        public static void greet() {
//            System.out.println("Greetings from method world");



