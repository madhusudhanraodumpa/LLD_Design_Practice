package composite.fileSystem1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> objectList = new ArrayList<>();

    public Directory(String directoryName, List<FileSystem> objectList) {
        this.directoryName = directoryName;
        this.objectList = objectList;
    }

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }
@Override
    public void ls() {
        System.out.println("Directory name "+directoryName);

        for (FileSystem object : objectList) {
           object.ls();

            }
        }

}
