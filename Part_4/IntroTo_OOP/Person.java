package Part_4.IntroTo_OOP;

public class Person {
    // private means the variables are "hidden" inside the object, this is known
    // as encapsulation
    private String name;
    private int age;

    //constructor that can be used to create new person object
    public Person(String initialName, int age0f ){
        this.age = age0f;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
        System.out.println(this.name + " aged one year");
    }


}
