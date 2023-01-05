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

        System.out.println("Search for? ");
        int entry = Integer.valueOf(scanner.next());


    }
}
