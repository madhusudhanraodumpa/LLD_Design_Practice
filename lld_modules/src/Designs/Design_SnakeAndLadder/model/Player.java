package Designs.Design_SnakeAndLadder.model;

public class Player {
    private int id;
    private String name;

    private int currentPosition;

    public Player(String name) {
        this.name =name;
        this.currentPosition = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
