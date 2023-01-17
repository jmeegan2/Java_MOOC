package Part_4.IntroTo_OOP.Part04_10;

public class Song {

    //instance variables
    private String name;
    private int length;

    //constructor
    public Song(String name, int length){
        this.name = name;
        this.length = length;
    }

    public String name(){
        return name;
    }

    public int length(){
        return length;
    }


}
