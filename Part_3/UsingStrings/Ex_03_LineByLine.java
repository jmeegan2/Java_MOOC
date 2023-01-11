package Part_3.UsingStrings;

import java.util.Scanner;

public class Ex_03_LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = String.valueOf(scanner.nextLine());

        String [] pieces = input.split(" ");

        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);
        }
    }
}
