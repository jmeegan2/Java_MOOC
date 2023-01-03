package Part_3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_14_OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String entry = String.valueOf(scanner.nextLine());

            //exit clause
            if (entry == "") {
                break;
            }

            list.add(entry);
        }


        System.out.print("Search for? ");
        String request = String.valueOf(scanner.next());

        if (list.contains(request)){
            System.out.println(request + " was found!");
        } else {
            System.out.println(request + " was not found!");
        }
    }
}
