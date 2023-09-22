package bridge;

public class Album implements Resource{
    @Override
    public void snippet() {
        System.out.println("Album snippet");
    }

    @Override
    public void url() {
        System.out.println("Album url");
    }
}
