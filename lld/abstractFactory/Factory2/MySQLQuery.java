package abstractFactory.Factory2;

public class MySQLQuery implements Query{
    @Override
    public void queryString() {
        System.out.println("MySQL query got created.");
    }
}
