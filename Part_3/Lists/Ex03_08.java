package Part_3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_08 {
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
        System.out.println("From where: ");
        int startingValue =  Integer.valueOf(scanner.nextLine());
        System.out.println("To where: ");
        int endValue = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < numList.size(); i++) {
            if(numList.get(i) > startingValue && numList.get(i) < endValue){
                System.out.println(numList.get(i));
            }
        }
    }
}
