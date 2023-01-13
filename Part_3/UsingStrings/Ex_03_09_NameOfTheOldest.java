package Part_3.UsingStrings;

import java.util.Scanner;

public class Ex_03_09_NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String oldestName = null;
        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            String currentName = String.valueOf((parts[0]));
            int currentAge = Integer.valueOf(parts[1]);
            if (currentAge > oldestAge) {
                oldestAge = currentAge;
                oldestName = currentName;
            }

        }
        System.out.println("Name of oldest: " + oldestName);
    }
}
