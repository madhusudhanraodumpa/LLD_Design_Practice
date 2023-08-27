package abstractFactory.abstarctFactory1;

public class MySqlDatabase implements DataBase{
    @Override
    public void connectConnection() {
        System.out.println("MySql database connection is connected:");
    }

    @Override
    public void closeConnection() {
        System.out.println("MySql database connection is closed:");
    }

    @Override
    public int getVersion() {
        System.out.println("MySql version is 2.0");
        return 0;
    }

    @Override
    public DataBaseFactory createDataBaseFactory() {
        DataBaseFactory dbf = new MySqlDataBaseFactory();
        return dbf;
    }
}
