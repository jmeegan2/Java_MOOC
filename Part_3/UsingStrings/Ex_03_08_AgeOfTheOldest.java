package Part_3.UsingStrings;

import java.util.Scanner;

public class Ex_03_08_AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        while(true){
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            int currentAge = Integer.valueOf(parts[1]);
            if(currentAge > oldestAge ) {
               oldestAge = currentAge;
            }
        }
    }
}
