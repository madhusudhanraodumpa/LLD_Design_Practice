package Designs.Design_SnakeAndLadder.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private int dimension;
    private int size;
    List<List<Cell>> cellsList;
    private int numberOfSnakes;
    private int numberOfLadders;

    public Board(int dimension,int numberOfSnakes,int numberOfLadders) {
        this.dimension = dimension;
        this.size = dimension *dimension;
        this.cellsList = new ArrayList<>();
        this.numberOfSnakes =numberOfSnakes;
        this.numberOfLadders =numberOfLadders;

        for(int row=0;row<dimension;row++) {
            this.cellsList.add(new ArrayList<>());
            for (int col=0;col<dimension;col++) {
                this.cellsList.get(row).add(new Cell(row,col));
            }
        }

        addSnakes(cellsList, numberOfSnakes);
        addLadders(cellsList,numberOfLadders);

    }

    private void addSnakes(List<List<Cell>> cellsList, int numberOfSnakes) {

        while (numberOfSnakes>0) {

            int start = getRandomNumber(cellsList);
            int end = getRandomNumber(cellsList);

           if(start<=end) {
               continue;
           }

           Jump snake=new Jump();
           snake.setStart(start);
           snake.setEnd(end);
           snake.setJumpType(JumpType.SNAKE);
           int row= generateRowNumber(start,dimension);
           int col = generateColNumber(start,dimension);
           this.cellsList.get(row).get(col).setJump(snake);
           numberOfSnakes--;

        }


    }

    private int getRandomNumber(List<List<Cell>> cellsList) {
        int num = ThreadLocalRandom.current().nextInt(1,(cellsList.size()* cellsList.size())-1);
        return num;
    }

    private void addLadders(List<List<Cell>> cellsList, int numberOfLadders) {

        while (numberOfLadders>0) {

            int start = getRandomNumber(cellsList);
            int end = getRandomNumber(cellsList);

            if(start>end) {
                continue;
            }

            Jump ladder=new Jump();
            ladder.setStart(start);
            ladder.setEnd(end);
            ladder.setJumpType(JumpType.LADDER);
            int row= generateRowNumber(start,dimension);
            int col = generateColNumber(start,dimension);
            this.cellsList.get(row).get(col).setJump(ladder);
            numberOfLadders--;

        }


    }


    private int generateRowNumber(int num,int size) {
        return  (int)num/size;

    }
    private int generateColNumber(int num,int size) {
        return num%size;

    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
