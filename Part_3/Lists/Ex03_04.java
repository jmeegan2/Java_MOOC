package Part_3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_04 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String input = String.valueOf(scanner.nextLine());

            if (input == "") {
                break;
            }

            inputs.add(input);
        }


        System.out.println("Total amount of words: " + inputs.size());

    }
}
// while(true) {
//            int number = Integer.valueOf(scanner.nextLine());
//            if (number == 0) {
//                break;
//            }
//
//            numList.add(number);
//        }
//        if(numList.size() < 3) {
//            System.out.println("Malfunction, insufficient amount of characters entered");
//        } else {
//            System.out.println(numList.get(1) + numList.get(2));
//        }