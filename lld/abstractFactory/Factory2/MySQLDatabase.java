package abstractFactory.Factory2;

public class MySQLDatabase implements Database{
    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
