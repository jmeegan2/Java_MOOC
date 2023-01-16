package Part_4.IntroTo_OOP;

public class Testing {
    public static void main(String[] args) {
        Person ada = new Person("Ada", 13);
        Person antti = new Person("Antti", 55);
        Person martin = new Person("Martin", 22);

        ada.printPerson();
        antti.printPerson();
        System.out.println("");

        ada.growOlder();
        ada.growOlder();
        System.out.println("");

        ada.printPerson();
        antti.printPerson();
    }
}