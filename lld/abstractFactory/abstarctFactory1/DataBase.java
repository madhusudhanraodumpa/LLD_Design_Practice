package abstractFactory.abstarctFactory1;

public interface DataBase {
    public void connectConnection();
    public void closeConnection();
    public int getVersion();
    public DataBaseFactory createDataBaseFactory();
}
