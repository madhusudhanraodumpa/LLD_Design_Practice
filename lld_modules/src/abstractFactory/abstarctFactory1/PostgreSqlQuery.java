package abstractFactory.abstarctFactory1;

public class PostgreSqlQuery implements Query{
    @Override
    public void prepareQuery() {
        System.out.println("PostgreSql query prepared:");
    }
}
