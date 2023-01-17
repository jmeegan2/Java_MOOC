package Part_4.IntroTo_OOP.Part04_09;

public class Debt {

    //double-typed instance variables
    private double balance;
    private double interestRate;

    //constructor
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance(){
        System.out.println(this.balance);
    }

    public void waitOneYear(){
        this.balance = this.balance * this.interestRate;
    }
}


