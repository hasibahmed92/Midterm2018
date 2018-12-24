package databases;

public class UnitTestConnectDB
{

    public static void main(String[] args)
    {

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        User a = new User("Hasib", "3737", "08/31/1971");

        System.out.println(a.getStName()+" "+a.getStID()+" "+a.getStDOB());

    }
}
