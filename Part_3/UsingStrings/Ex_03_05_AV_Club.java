package Part_3.UsingStrings;

import java.util.Scanner;

public class Ex_03_05_AV_Club {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("")){
                break;
            }

        String[] pieces = input.split(" ");

        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i].contains("av")) {
                System.out.println(pieces[i]);
            }
        }
    }
        System.out.println("End of program");

    }
}
