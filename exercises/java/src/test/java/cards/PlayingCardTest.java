package cards;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PlayingCardTest {

    @Test
    public void getSuit_returnsClubsIfSuitNumberIs0(){
        //given
        PlayingCard playingCard = new PlayingCard(0, 1);
        //when
        String result = playingCard.getSuit();
        //then
        assertThat(result).isEqualTo("clubs");
    }

    @Test
    public void getFaceValue_returns1IfFaceValueIs1(){
        //given
        PlayingCard playingCard = new PlayingCard(0, 1);
        //when
        String result = playingCard.getFaceValue();
        //then
        assertThat(result).isEqualTo("2");
    }

    @Test
    public void getFaceValue_returns1IfFaceValueIs10(){
        //given
        PlayingCard playingCard = new PlayingCard(0, 10);
        //when
        String result = playingCard.getFaceValue();
        //then
        assertThat(result).isEqualTo("jack");
    }

}