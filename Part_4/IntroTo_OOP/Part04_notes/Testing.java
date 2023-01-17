package Part_4.IntroTo_OOP.Part04_notes;

public class Testing {
    public static void main(String[] args) {
        Person ada = new Person("Ada", 13);
        Person antti1 = new Person("Antti", 55);
        Person martin = new Person("Martin", 22);

        ada.printPerson();
        antti1.printPerson();
        System.out.println("");

        ada.growOlder();
        ada.growOlder();
        System.out.println("");

        ada.printPerson();
        antti1.printPerson();


        System.out.println("\nAda's age: " + ada.returnAge());
        System.out.println("Antti's age: " + antti1.returnAge());
        int combined = ada.returnAge() + antti1.returnAge();

        System.out.println("Combined age " + combined);

        Person pekka = new Person("Pekka", 0 );
        Person antti = new Person("Antti", 0);

        int i = 0;
        while (i < 30) {
            pekka.growOlder();
            i = i + 1;
        }

        antti.growOlder();

        System.out.println("");

        if (antti.isOfLegalAge()) {
            System.out.print("of legal age: ");
            antti.printPerson();
        } else {
            System.out.print("underage: ");
            antti.printPerson();
        }

        if (pekka.isOfLegalAge()) {
            System.out.print("of legal age: ");
            pekka.printPerson();
        } else {
            System.out.print("underage: ");
            pekka.printPerson();
        }

        if (antti.isOfLegalAge()) {
            System.out.println(antti.getName() + " is of legal age");
        } else {
            System.out.println(antti.getName() + " is underage");
        }

        if (pekka.isOfLegalAge()) {
            System.out.println(pekka.getName() + " is of legal age");
        } else {
            System.out.println(pekka.getName() + " is underage ");
        }
    }
}