package Part_4.IntroTo_OOP;

public class Ex04_01_yourFirstAccount {
    public static void main(String[] args) {
        Account testBobAccount = new Account("Bob", 100.0);

        testBobAccount.deposit((20.0));
        System.out.println(testBobAccount);
    }
}
