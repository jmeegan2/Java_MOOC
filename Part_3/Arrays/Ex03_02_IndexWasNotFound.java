package Part_3.Arrays;

import java.util.Scanner;

public class Ex03_02_IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[4];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;

        System.out.print("Search for? ");
        int entry = Integer.valueOf(scanner.next());

        int index = 0;
        boolean isFound = false;
        while(index < numbers.length) {
            if(entry == numbers[index]){
                System.out.println(entry + " is at index "+ index);
                isFound = true;
            } index++;
        }
        if(!isFound) {
            System.out.println(entry + " was not found.");
        }




    }
}
