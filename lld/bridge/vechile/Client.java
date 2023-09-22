package bridge.vechile;

public class Client {
    public static void main(String[] args) {
        Work work = new Assemble();
        Vechile vechile = new Car(work);
        vechile.prepare();

    }
}
