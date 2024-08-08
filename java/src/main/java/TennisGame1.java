import java.util.Objects;

public class TennisGame1 implements TennisGame {
    
    private int player1Score = 0;
    private int player2Score = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, player1Name)) {
            player1Score += 1;
        } else {
            player2Score += 1;
        }
    }

    public String getScore() {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (player1Score == player2Score) {
            score = switch (player1Score) {
                case 0 -> new StringBuilder("Love-All");
                case 1 -> new StringBuilder("Fifteen-All");
                case 2 -> new StringBuilder("Thirty-All");
                default -> new StringBuilder("Deuce");
            };
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) {
                score = new StringBuilder("Advantage " + player1Name);
            } else if (minusResult == -1) {
                score = new StringBuilder("Advantage " + player2Name);
            } else if (minusResult >= 2) {
                score = new StringBuilder("Win for " + player1Name);
            } else {
                score = new StringBuilder("Win for " + player2Name);
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = player1Score;
                } else {
                    score.append("-");
                    tempScore = player2Score;
                }
                switch(tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}
