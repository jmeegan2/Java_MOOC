package Part_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;



public class Lists {

    //ArrayList is a pre-made tool in java that helps dealing with lists, its offers varius methods including
    // adding values to list and removing values from the list, and also retrieval of a value from a specific place
    // in the list

    public static void main(String[] args) {
        // create a list

//        ArrayList<String> list = new ArrayList<>();
//
//        ArrayList<Integer> listInt = new ArrayList<>();
//        int integer = 1;
//        listInt.add(integer);
//
//        ArrayList<Double> listDbl = new ArrayList<>();
//        double d = 4.2;
//        listDbl.add(d);
//
//        ArrayList<Boolean> listBool = new ArrayList<>();
//        listBool.add(true);

        //To add you do name.add
        //To retrieve you do name.get

//        ArrayList<String> wordList = new ArrayList<>();
//
//        wordList.add("First");
//        wordList.add("Second");
//
//        // retrieve the value from position 0 of the word list, and print it
//        System.out.println(wordList.get(1));


        // the list isn't used yet

        // Third Element Exercise
//        Scanner scanner = new Scanner(System.in);
//
//        //so asking user to input at least three values
//
//
//        ArrayList<String> wordList = new ArrayList<>();
//
//        System.out.println("Add values to list, Enter \"Stop\" to exit");
//        String input = scanner.nextLine();
//        while (!input.equals("Stop")){
//            wordList.add(input);
//            input = scanner.nextLine();
//        }
//        if(wordList.size() >= 3 && input.equals("Stop")) {
//            System.out.println(wordList.get(2));
//        } else {
//            System.out.println("malfunction not enough values entered");
//        }

        //Second plus third exercise
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> numList = new ArrayList<>();
//        System.out.println("Enter values to the list, enter \"0\" to exit");
//
//        while(true) {
//            int number = Integer.valueOf(scanner.nextLine());
//            if (number == 0) {
//                break;
//            }
//
//            numList.add(number);
//        }
//        if(numList.size() < 3) {
//            System.out.println("Malfunction, insufficient amount of characters entered");
//        } else {
//            System.out.println(numList.get(1) + numList.get(2));
//        }

        //Example of out of IndexOutOfBounds
//        ArrayList<String> wordList = new ArrayList<>();
//
//        wordList.add("First");
//        wordList.add("Second");
//
//        System.out.println(wordList.get(2));

//        ArrayList<String> teachers = new ArrayList<>();
//        teachers.add("Simon");
//        teachers.add("Samuel");
//        teachers.add("Ann");
//        teachers.add("Anna");
//
//        System.out.println(teachers.get(0));
//        System.out.println(teachers.get(1));
//        System.out.println(teachers.get(2));
//        System.out.println(teachers.get(3));

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Number of values on the list: " + list.size());

        list.add("First");
        System.out.println("Number of values on the list: " + list.size());

        int values = list.size();

        list.add("Second");
        System.out.println("Number of values on the list: " + values);
    }

}
