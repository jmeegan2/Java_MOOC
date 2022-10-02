package Part_1;

import java.util.Scanner;

public class CalculatingWithNumbers {
    public static void main(String[] args) {
        //basic math operators + - * /

        //Seconds in day
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many days would you like to convert to seconds? ");
//        int number = Integer.valueOf(scanner.nextLine());
//        int  ConvertedNum = number * 24 * 60 * 60;
//        System.out.println(ConvertedNum);

        Scanner scanner = new Scanner(System.in);
        //sum of numbers
//        System.out.println("Give first number: ");
//        int firstNum = Integer.valueOf(scanner.nextLine());
//        System.out.println("Give second number: ");
//        int secondNum = Integer.valueOf(scanner.nextLine());
//        System.out.println("Give third number: ");
//        int thirdNum = Integer.valueOf(scanner.nextLine());
//        int sum = firstNum + secondNum + thirdNum;
//        System.out.println("Sum of nums:  " + sum);

        // Addition formula
//        System.out.println("Give the first number: ");
//        int firstNum = Integer.valueOf(scanner.nextLine());
//        System.out.println("Give the second number: ");
//        int secondNum = Integer.valueOf(scanner.nextLine());
//        int sum = firstNum + secondNum;
//        System.out.println(firstNum + " + " + secondNum + " = " + sum );

        //Multiplication formula
//        System.out.println("Give the first number: ");
//        int firstNum = Integer.valueOf(scanner.nextLine());
//        System.out.println("Give the second number: ");
//        int secondNum = Integer.valueOf(scanner.nextLine());
//        int sum = firstNum * secondNum;
//        System.out.println(firstNum + " * " + secondNum + " = " + sum );

//        System.out.println("Give the first number: ");
//        int firstNum = Integer.valueOf(scanner.nextLine());
//        System.out.println("Give the second number: ");
//        int secondNum = Integer.valueOf(scanner.nextLine());
//        System.out.println("Give the third number: ");
//        int thirdNum = Integer.valueOf(scanner.nextLine());
//        double sumAverage = (firstNum + secondNum + thirdNum) / 3 ;
//
//        System.out.println("The average of three numbers: " + sumAverage);


        //Simple calculator
        System.out.println("Give the first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());
        int sumAdd = (firstNum + secondNum);
        int sumSubtract = (firstNum - secondNum);
        int sumMulti = (firstNum * secondNum);
        double sumDiv = (firstNum/secondNum);
        double sumAverage = (firstNum + secondNum) / 2 ;
        System.out.println(firstNum + " + " + secondNum + " = " + sumAdd);
        System.out.println(firstNum + " - " + secondNum + " = " + sumSubtract);
        System.out.println(firstNum + " * " + secondNum + " = " + sumMulti);
        System.out.println(firstNum + " / " + secondNum + " = " + sumDiv);



    }
}
