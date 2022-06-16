package cards;

public class PlayingCardDeck {
    private PlayingCard[] cards;
    private String[] result;

    public PlayingCardDeck(int numberOfCards){
        cards = new PlayingCard[numberOfCards];
        result = new String[numberOfCards];
    }

    public String[] createDeckOfCards(){

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                cards[suit*13+faceValue] = new PlayingCard(suit, faceValue);
            }
        }

        int cardNumber = 0;
        for (PlayingCard card : cards) {
            String faceValueName;
            faceValueName = card.getFaceValue();

            String suitName;
            suitName = card.getSuit();
            result[cardNumber] = faceValueName + " of " + suitName;
            cardNumber++;
        }

        return result;
    }
}
