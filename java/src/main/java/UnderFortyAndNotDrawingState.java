public class UnderFortyAndNotDrawingState implements GameState {

    private Player playerOne;
    private Player playerTwo;
    private final TennisTermTranslator translator;

    public UnderFortyAndNotDrawingState(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        translator = new TennisTermTranslator();
    }

    public String getScore() {
        String playerOneScore = translator.fromScore(playerOne.getScore());
        String playerTwoScore = translator.fromScore(playerTwo.getScore());

        return String.format("%s-%s", playerOneScore, playerTwoScore);
    }
}