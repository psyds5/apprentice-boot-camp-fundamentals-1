package cards;

public class PlayingCard {
    int suit;
    int faceValue;

    public PlayingCard(int suit, int faceValue){
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getSuit(){
        Suit suitClass = new Suit(suit);
        return suitClass.getSuite();
    }

    public String getFaceValue() {
        String faceValueName;
        switch (faceValue) {
            case 0:
                faceValueName = "ace";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                faceValueName = Integer.toString(faceValue + 1);
                break;
            case 10:
                faceValueName = "jack";
                break;
            case 11:
                faceValueName = "queen";
                break;
            case 12:
                faceValueName = "king";
                break;
            default:
                throw new IllegalArgumentException("Something went wrong " + faceValue + "is not a valid faceValue!");

        }
        return faceValueName;
    }
}
