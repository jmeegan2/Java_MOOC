package Part_4.IntroTo_OOP.Part04_12;

public class Gauge {
    // instance variables
    private int value;

    //constructor
    public Gauge() {
        this.value = 0;
    }

    public void increase(){
        this.value++;
    }

    public void decrease(){
        this.value--;
    }

    public int value() {
        return value;
    }

    public boolean full() {
        return this.value == 5;
    }
}
