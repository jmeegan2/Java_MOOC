package Part_4.IntroTo_OOP.Part04_08;

public class Application {
    public static void main(String[] args) {

        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.reset();
        counter.printValue();

    }
}
