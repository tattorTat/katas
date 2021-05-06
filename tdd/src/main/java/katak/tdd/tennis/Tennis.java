package katak.tdd.tennis;

public class Tennis {
    int side1Score = 0;
    int side2Score = 0;

    public int getSide1Score() {
        return side1Score;
    }

    public int getSide2Score() {
        return side2Score;
    }

    public void addToSide1Score() {
        side1Score++;
    }

    public void addToSide2Score() {
        side2Score++;
    }
}
