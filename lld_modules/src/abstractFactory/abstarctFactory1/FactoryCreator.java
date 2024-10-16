package abstractFactory.abstarctFactory1;

public class FactoryCreator {
     public static DataBaseFactory createFactory(String dataBaseName){

         if(dataBaseName.equalsIgnoreCase("MySql")){
             return new MySqlDataBaseFactory();
         } else if (dataBaseName.equalsIgnoreCase("PostGreSql")) {
             return new PostgreSQLDatabaseFactory();

         }
        return null;

     }

}
