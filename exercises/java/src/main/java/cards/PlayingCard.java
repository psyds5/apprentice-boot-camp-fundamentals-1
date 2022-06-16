package cards;

public class PlayingCard {
    int suit;
    //int faceValue;

    public PlayingCard(int suit){
        this.suit = suit;
        //this.faceValue = faceValue;
    }

    public String getSuit(){
        String suitName;
        switch (suit){
            case 0: suitName = "clubs"; break;
            case 1: suitName = "diamonds"; break;
            case 2: suitName = "hearts"; break;
            case 3: suitName = "spades"; break;
            default: throw new IllegalArgumentException("Something went wrong " + suit + "is not a valid suitName!");
        }
        return suitName;
    }



}
