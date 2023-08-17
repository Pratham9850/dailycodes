package jdbs.MyConnectivity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MySqlConnector obj = new MySqlConnector();
        obj.dbConnect();
        obj.executeStatements();
        //obj.insertRecords();
        //obj.getRecords();
        obj.showRecords(2);
        //obj.insertItemData(3, "milk", 40, 12);
    }
}
