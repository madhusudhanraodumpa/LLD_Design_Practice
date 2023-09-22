package composite.fileSystem;

public class File {

    public File(String fileName) {
        this.fileName = fileName;
    }

    String fileName;
    public void ls() {
        System.out.println("file name is " +fileName);
    }
}
