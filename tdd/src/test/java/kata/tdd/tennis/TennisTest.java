package kata.tdd.tennis;

import katak.tdd.tennis.Tennis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest {


    @Test
    void newGameReturns0ForPlayersScores() {
        //given
        Tennis tennis = new Tennis();
        //when

        //then
        assertEquals(tennis.getPlayer1Score(), 0);
        assertEquals(tennis.getPlayer2Score(), 0);
    }

    @Test
    void adds1ToPlayerOnesScore() {
        //given
        Tennis tennis = new Tennis();

        //when
        tennis.addToPlayer1Score();
        //then
        assertEquals(tennis.getPlayer1Score(), 1);
    }

    @Test
    void adds1ToPlayerTwosScore() {
        //given
        Tennis tennis = new Tennis();

        //when
        tennis.addToPlayer2Score();
        //then
        assertEquals(tennis.getPlayer2Score(), 1);

    }
}
