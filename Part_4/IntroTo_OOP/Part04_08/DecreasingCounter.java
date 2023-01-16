package Part_4.IntroTo_OOP.Part04_08;

public class DecreasingCounter {

    private int value;

    public DecreasingCounter(int initialValue){
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        if((this.value > 0) ) {
            this.value = this.value - 1;
        }


    }

    // and the other methods go here
}
