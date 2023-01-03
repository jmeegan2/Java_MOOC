package Part_3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_13_AverageOfList {
    public static void main(String[] args) {
        double sum = 0;
        double average = 0;
        double counter = 0;

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {

            double num = Double.valueOf(scanner.nextLine());
            if(num == -1){
                break;
            } else {
               counter++;
            }
            list.add((int) num);
            sum = sum + num;
            average = sum/counter;
        }
        System.out.println("Average: " + average);
    }
}
