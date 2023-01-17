package Part_4.IntroTo_OOP.Part04_10;

public class Application {
    public static void main(String[] args) {
        Song garden = new Song("In the Garden", 10190);
        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
    }
}
