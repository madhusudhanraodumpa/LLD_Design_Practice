package abstractFactory.Factory2;

public class MangoDBQuery implements Query{
    @Override
    public void queryString() {
        System.out.println("MangoDB query got created.");
    }
}
