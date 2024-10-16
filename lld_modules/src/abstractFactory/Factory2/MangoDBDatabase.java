package abstractFactory.Factory2;

public class MangoDBDatabase implements Database{
    @Override
    public Query createQuery() {
        return new MangoDBQuery();
    }
}
