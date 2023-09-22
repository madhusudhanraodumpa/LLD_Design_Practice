package flyWeight;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final List<Tree> trees;
    private final List<TreePosition> treePositions;

    private final TreeFactory treeFactory;

    public Game() {
        this.trees = new ArrayList<>();
        this.treePositions = new ArrayList<>();
        this.treeFactory = TreeFactory.getInstance();
    }

    public void addTree(int x, int y, String color) {
        Tree tree = treeFactory.getTree(color);

        if (tree == null) return;

        trees.add(tree);
        treePositions.add(new TreePosition(x, y));

        final int treeId = trees.size() - 1;
        this.renderTree(treeId);
    }

    private void renderTree(int id) {
        System.out.println("Tree " + id
                + " with " + trees.get(id).getColor() + " color"
                + " rendered at " + treePositions.get(id).getxPosition()
                + ", " + treePositions.get(id).getyPosition());
    }
}
