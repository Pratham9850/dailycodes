package jdbs.MyConectivityCaseStudy2;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SqlConnector1 obj = new SqlConnector1();
        obj.dbConnect();
        //obj.executeStatements();
        //obj.insertQuery();
        //obj.getPackageRecords();
        //obj.getCustomerRecords();
        obj.showRecords(500);
        
    }
}
