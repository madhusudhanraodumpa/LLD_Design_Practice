package composite.fileSystem1;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        FileSystem file = new File("madhu.jpg");

        FileSystem directory = new Directory("java");
        List<FileSystem> list = Arrays.asList(file,directory);
        FileSystem mainDir= new Directory("mainDirectory",list);
        mainDir.ls();

    }
}
