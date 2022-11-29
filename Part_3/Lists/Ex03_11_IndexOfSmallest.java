package Part_3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_11_IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 9999) {
                break;
            }
            numList.add(num);
        }
        System.out.println("done");

        int smallest = numList.get(0);
        for(int i = 0; i < numList.size(); i++) {
            int number = numList.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);
        int index;
        for(int i = 0; i < numList.size(); i++) {
            int value = numList.get(i);
           index = i;
            if(smallest == value){
                System.out.println("Found at index: " + index);
            }
        }
    }


}
/*
public class Ex03_10_IndexOf {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            numList.add(num);
        }
        System.out.println("Search for? ");
       int number = Integer.valueOf(scanner.nextLine());
       int index;

       for (int i = 0; i < numList.size(); i++) {
           int value = numList.get(i);
           if (number == value){
               index = i;
               System.out.println(number + " is at index " + index);
           }
       }
    }
}
 */