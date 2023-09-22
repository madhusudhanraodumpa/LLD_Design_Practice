package flyWeight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    Map<String,Tree> map ;
    private static TreeFactory instance;

    private TreeFactory() {
        map = new HashMap<>();
    }
    public static TreeFactory getInstance() {

        if(instance == null) {
            synchronized (TreeFactory.class) {
                if(instance == null) {
                    instance = new TreeFactory();
                }
            }
        }
        return instance;
    }
    public Tree getTree(String color) {
        if(color == null) return null;
        if(!color.equalsIgnoreCase("green") && !color.equalsIgnoreCase("brown")) {
            return null;
        }
        if(map == null) return null;

        if (map.containsKey(color)) {
            return map.get(color);
        }

        Tree tree = new Tree(color,6);
        map.put(color,tree);
        return tree;
    }
}
