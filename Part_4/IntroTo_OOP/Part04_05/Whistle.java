package Part_4.IntroTo_OOP.Part04_05;

public class Whistle {
    private String sound;

    //constructor
    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
    System.out.println(this.sound);
    }
}