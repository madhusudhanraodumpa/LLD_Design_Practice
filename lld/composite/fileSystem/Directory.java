package composite.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> objectList = new ArrayList<>();

    public Directory(String directoryName, List<Object> objectList) {
        this.directoryName = directoryName;
        this.objectList = objectList;
    }

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void ls() {
        System.out.println("Directory name "+directoryName);

        for (Object object : objectList) {
            if(object instanceof File) {
                ((File) object).ls();
            } else if (object instanceof  Directory) {
                ((Directory) object).ls();

            }
        }
    }
}
