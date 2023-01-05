package Part_3.Arrays;

import java.util.Scanner;

public class Ex03_01_Swap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        for (int element: numbers) {
            System.out.println(element);
        }

        System.out.println("Give two indices to swap: ");
        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());

        int helper = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = helper;

        for (int element: numbers) {
            System.out.println(element);
        }

    }
}
