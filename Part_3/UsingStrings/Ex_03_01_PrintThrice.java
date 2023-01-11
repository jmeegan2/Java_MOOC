package Part_3.UsingStrings;

import java.util.Scanner;

public class Ex_03_01_PrintThrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a word: ");
        String input = String.valueOf(scanner.next());

        for(int i = 0; i < 3; i++) {
            System.out.print(input);
        }
    }
}
