package abstractFactory.abstarctFactory1;

public class PostgreSQLDatabaseFactory implements DataBaseFactory{
    @Override
    public Query createQuery() {
        return new PostgreSqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new PostgreSqlTransaction();
    }
}
