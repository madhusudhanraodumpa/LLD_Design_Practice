package abstractFactory.abstarctFactory1;

public class MySqlQuery implements Query{
    @Override
    public void prepareQuery() {
        System.out.println("MySql query prepared:");
    }
}
