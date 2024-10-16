package Designs.Design_SnakeAndLadder.model;

public abstract class Move {
    private int startPosition;
    private int endPosition;

    public Move(int startPosition, int endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }
    public abstract String getEncounterMessage();
    public abstract String getString();

    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(int endPosition) {
        this.endPosition = endPosition;
    }
}
