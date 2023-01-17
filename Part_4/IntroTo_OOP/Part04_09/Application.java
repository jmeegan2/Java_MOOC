package Part_4.IntroTo_OOP.Part04_09;

public class Application {
    public static void main(String[] args) {

        Debt mortgage = new Debt(120000,1.03);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 1920;

        while (years < 1941) {
            mortgage.waitOneYear();
            years++;
        }

        mortgage.printBalance();
    }
}
