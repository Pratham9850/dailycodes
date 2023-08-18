package mongoproject.mongoclientapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MongoApp obj=new MongoApp();
        obj.createCollection();
        obj.getCollections();
        
        obj.updateDocument();
       // obj.viewDocuments();
       obj.addToCollection(1,"56565656","565656565",4,5);
     //  obj.addToCollection("Sam","Training");
       obj.viewDocuments();
    }
}
