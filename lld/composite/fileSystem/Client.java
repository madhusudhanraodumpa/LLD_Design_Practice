package composite.fileSystem;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        File file = new File("madhu.jpg");

        Directory directory = new Directory("java");
        List<Object> list = Arrays.asList(file,directory);
        Directory mainDir= new Directory("mainDirectory",list);
        mainDir.ls();

    }
}
