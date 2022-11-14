package Part_3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_07 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {

            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }

            numList.add(num);

        }

        for(int i = 0 ; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }
    }
}
