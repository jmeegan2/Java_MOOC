package Part_3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {

            String input = String.valueOf(scanner.nextLine());
            if(input == "") {
                break;
            }

            names.add(input);

        }

        System.out.println(names.get(names.size() - 1));

    }
}
