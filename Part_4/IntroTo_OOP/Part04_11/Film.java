package Part_4.IntroTo_OOP.Part04_11;

public class Film {
    //instance variables
    private String name;
    private int ageRating;

    //constructor
    public Film(String filmName, int filmAgeRating){
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }

    public String name() {
        return name;
    }

    public int getAgeRating(){
        return ageRating;
    }
}
