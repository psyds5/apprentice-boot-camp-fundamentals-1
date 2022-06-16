package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    String[] getCards() {
        String[] result = new String[52];
        int[][] deck = new int[52][2];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck[suit*13+faceValue] = new int[]{suit, faceValue};
            }
        }

        int cardNumber = 0;
        for (int[] card : deck) {
            PlayingCard playingCard = new PlayingCard(card[0], card[1]);
            String faceValueName;
            faceValueName = playingCard.getFaceValue();

            String suitName;
            suitName = playingCard.getSuit();
            result[cardNumber] = faceValueName + " of " + suitName;
            cardNumber++;
        }

        return result;
    }
}
