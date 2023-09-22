package bridge;

public class Artist implements Resource{
    @Override
    public void snippet() {
        System.out.println("Artist snippet");
    }

    @Override
    public void url() {
        System.out.println("Artist url");
    }
}
