package abstractFactory.abstarctFactory1;

public class PostgreSqlTransaction implements Transaction{
    @Override
    public void prepareTransaction() {
        System.out.println("PostGrelSql transaction prepared:");
    }
}
