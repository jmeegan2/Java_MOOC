package Part_3.UsingStrings;

import java.util.Scanner;

public class Ex_03_06_FirstWords {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        while(true){
            String input = String.valueOf(scanner.nextLine());

            if(input.equals("")) {
                break;
            }
            String[] pieces = input.split(" ");
            System.out.println(pieces[0]);
        }
    }
}
