package bridge;

public class Client {
    public static void main(String[] args) {
        View view = new LongView(new Artist());
        view.show();
        view.button();

    }
}
