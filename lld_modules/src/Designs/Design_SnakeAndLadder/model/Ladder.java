package Designs.Design_SnakeAndLadder.model;

public class Ladder extends Move{
    public Ladder(int startPosition, int endPosition) {
        super(startPosition,endPosition);
    }

    @Override
    public String getEncounterMessage() {
        return "Wohoo!! You got a laddder";
    }

    @Override
    public String getString() {
        return null;
    }
}
