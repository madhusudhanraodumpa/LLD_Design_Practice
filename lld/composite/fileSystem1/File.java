package composite.fileSystem1;

public class File  implements FileSystem{

    public File(String fileName) {
        this.fileName = fileName;
    }

    String fileName;
    @Override
    public void ls() {
        System.out.println("file name is " +fileName);
    }
}
