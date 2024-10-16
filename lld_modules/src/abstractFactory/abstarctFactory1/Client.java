package abstractFactory.abstarctFactory1;

public class Client
{
    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.registerUser("PostGreSql");
    }
}
