package Part_3.UsingStrings;

import java.util.Scanner;

public class Ex_03_10_PersonalDetails {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double average = 0;
        double sum = 0;
        String longestName = "";
        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            String currentName = String.valueOf(parts[0]);
            int currentBirthYear = Integer.valueOf(parts[1]);
            if(currentName.length() > longestName.length() ) {
                longestName = currentName;
            }
            sum += currentBirthYear;
            average++;

        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + (sum/average));

    }
}
