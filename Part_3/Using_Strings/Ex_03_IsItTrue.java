package Part_3.Using_Strings;

import java.util.Scanner;

public class Ex_03_IsItTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String input = String.valueOf(scanner.next());
        if(input.equals("true")){
            System.out.println("You got it right");
        } else {
            System.out.println("try again! ");
        }

    }
}
