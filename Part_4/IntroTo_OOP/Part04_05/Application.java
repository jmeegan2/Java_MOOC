package Part_4.IntroTo_OOP.Part04_05;

public class Application {
    public static void main(String[] args) {
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
