package abstractFactory.Factory2;

public class Client {
    public static void main(String[] args) {

        Database database = new MangoDBDatabase();
        database.createQuery().queryString();
    }
}
