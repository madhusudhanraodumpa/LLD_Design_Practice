package abstractFactory.abstarctFactory1;

public class UserService {
    public void registerUser(String dataBaseName){
        DataBaseFactory dbf = FactoryCreator.createFactory(dataBaseName);
        dbf.createQuery().prepareQuery();
        dbf.createTransaction().prepareTransaction();

    }
}
