package abstractFactory.abstarctFactory1;

public class MySqlDataBaseFactory implements DataBaseFactory{
    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new MySqlTransaction();
    }
}
