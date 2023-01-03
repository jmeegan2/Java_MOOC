package Part_3.Lists;

import java.util.ArrayList;

public class Ex03_17_RemoveLast {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        int stringCounter = -1;
        for(String ignored : strings) {
            stringCounter++;
        }
        strings.remove(stringCounter);
    }
}
