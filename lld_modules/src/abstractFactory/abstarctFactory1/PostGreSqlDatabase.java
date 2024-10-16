package abstractFactory.abstarctFactory1;

public class PostGreSqlDatabase implements DataBase{
    @Override
    public void connectConnection() {

    }

    @Override
    public void closeConnection() {

    }

    @Override
    public int getVersion() {
        return 0;
    }

    @Override
    public DataBaseFactory createDataBaseFactory() {
        return new PostgreSQLDatabaseFactory();
    }
}
