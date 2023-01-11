package Part_3.UsingStrings;

import java.util.Scanner;

public class Ex_03_07_LastWords {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        while(true){
            String input = String.valueOf(scanner.nextLine());

            if(input.equals("")) {
                break;
            }
            String[] pieces = input.split(" ");
            int lastPieces = pieces.length;
            System.out.println(pieces[lastPieces - 1]);
        }
    }
}
