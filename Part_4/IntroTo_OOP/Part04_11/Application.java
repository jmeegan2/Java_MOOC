package Part_4.IntroTo_OOP.Part04_11;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you: ");
        int age = Integer.valueOf(scanner.next());

        System.out.println();
        if (age >= chipmunks.getAgeRating()){
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }
    }
}
