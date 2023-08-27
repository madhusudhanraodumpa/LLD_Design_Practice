package abstractFactory.abstarctFactory1;

public interface DataBaseFactory {
    public Query createQuery();
    public Transaction createTransaction();
}
