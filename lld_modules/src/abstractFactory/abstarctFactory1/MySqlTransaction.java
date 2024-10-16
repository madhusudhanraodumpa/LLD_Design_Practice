package abstractFactory.abstarctFactory1;

public class MySqlTransaction implements Transaction{
    @Override
    public void prepareTransaction() {
        System.out.println("MySql transaction prepared:");
    }
}
