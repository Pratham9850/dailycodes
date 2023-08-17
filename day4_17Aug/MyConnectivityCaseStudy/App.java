package jdbs.MyConnectiveCaseStudy;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SqlConnector obj = new SqlConnector();
        obj.dbConnect();
        obj.executeStatements();
        //obj.insertRecords();
        //obj.getRecords();
        //obj.updateRecords();
        //obj.selectRecords();
        /*
        obj.insertItemData(6, "232154637", "bad", 1, "Iron man", 53);
        obj.insertItemData(7, "232124325365", "good but sloww", 3, "Stephen Hawling", 24);
        obj.insertItemData(8, "53636634", "very bad", 0, "Rocky Singh", 78);
        obj.insertItemData(9, "789482945", "excellent", 5, "Ram Adams", 17);
        obj.insertItemData(10, "0981482945", "good", 3, "Steve Colon", 31);
        */
        
        //obj.select_Records(30);
      //obj.update_Records(20, 5);
    }
}
