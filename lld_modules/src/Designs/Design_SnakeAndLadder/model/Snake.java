package Designs.Design_SnakeAndLadder.model;

public class Snake extends Move{

    public Snake(int startPosition, int endPosition) {
        super(startPosition,endPosition);
    }

    @Override
    public String getEncounterMessage() {
        return "Oops you encountered a SNAKE";
    }

    @Override
    public String getString() {
        return null;
    }
}
