package katak.tdd.tennis;

public class Tennis {
    public static final String DEUCE = "Deuce";
    int side1Score = 0;
    int side2Score = 0;

    public int getSide1Score() {
        return side1Score;
    }

    public int getSide2Score() {
        return side2Score;
    }

    public void addToSide1Score(int score) {
        side1Score += score;
    }

    public void addToSide2Score(int score) {
        side2Score += score;
    }

    public String getTranslatedScore() {
        return DEUCE;
    }
}
