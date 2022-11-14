package Part_3.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex03_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        //Greatest in list

        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1) {
                break;
            }
            numList.add(num);
        }

        System.out.println("Greatest num: " + Collections.max(numList));
    }
}
