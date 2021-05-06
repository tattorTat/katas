package katak.tdd.tennis;

public class Tennis {
    int player1Score = 0;
    int player2Score = 0;

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void addToPlayer1Score() {
        player1Score++;
    }

    public void addToPlayer2Score() {
        player2Score++;
    }
}
