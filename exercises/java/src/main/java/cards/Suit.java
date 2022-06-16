package cards;

public class Suit {
    private String name;

    public Suit(int suitNumber){
        switch (suitNumber){
            case 0: name = "clubs"; break;
            case 1: name = "diamonds"; break;
            case 2: name = "hearts"; break;
            case 3: name = "spades"; break;
            default: throw new IllegalArgumentException("Something went wrong " + suitNumber + "is not a valid suitName!");
        }
    }

    public String getSuite(){
        return name;
    }
}
