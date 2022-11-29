package Part_3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_12_SumOfAList {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1) {
                break;
            }
            list.add(num);
            sum = sum + num;
        }

    }
}
