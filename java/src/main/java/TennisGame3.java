import java.util.Objects;

public class TennisGame3 implements TennisGame {
    
    private int playerTwoScore;
    private int playerOneScore;
    private final String playerOneName;
    private final String playerTwoName;

    public TennisGame3(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public String getScore() {
        String playerOneScoreAsString;
        String playerTwoScoreAsString;
        String playerNameWithHigherScore = playerOneScore > playerTwoScore ? playerOneName : playerTwoName;
        String[] arrayOfScoreNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        if (playerOneScore < 4 && playerTwoScore < 4 && !(playerOneScore + playerTwoScore == 6)) {
            playerOneScoreAsString = arrayOfScoreNames[playerOneScore];
            playerTwoScoreAsString = arrayOfScoreNames[playerTwoScore];
            return (playerOneScore == playerTwoScore) ? playerOneScoreAsString + "-All" :
                    playerOneScoreAsString + "-" + playerTwoScoreAsString;
        } else if (playerOneScore == playerTwoScore) {
                return "Deuce";
        } else {
            return (Math.pow((playerOneScore - playerTwoScore), 2) == 1) ?
                    "Advantage " + playerNameWithHigherScore : "Win for " + playerNameWithHigherScore;
        }
    }
    
    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, playerOneName)) {
            this.playerOneScore += 1;
        } else if (Objects.equals(playerName, playerTwoName)) {
            this.playerTwoScore += 1;
        }
    }
}
