package jdbs.MyConnectivity;
import java.sql.*;


public class MySqlConnector {
	
	public static final String URL ="jdbc:mysql://localhost:3306/mysql";
	public static final String USERNAME="root";
	public static final String PASSWORD="1234";
	Connection con;
	Statement stat;
	
	public void dbConnect() {
		
		try {
			
			 con =DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			System.out.println("Connection established");
			System.out.println(con.getMetaData().getDatabaseProductName());
			System.out.println(con.getClientInfo());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void executeStatements() {
		
		String query="create table items(itemid int primary key, itemname varchar(20),itemprice float, itemquantity int)";
		
		try {
			
			stat=con.createStatement();
			boolean result=stat.execute(query);
			if(result)
			{
				System.out.println("table not created");
			}
			else
			{
				System.out.println("table created");
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void insertRecords()
	{
		String insertCommand="insert into items values(2,'Tea',15,30)";
		
		try {
		 int recordsaffected= stat.executeUpdate(insertCommand);
		 System.out.println("record inserted "+recordsaffected);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public void getRecords(){
		String query="Select * from items";
		try {
			 ResultSet result=stat.executeQuery(query);
			 while(result.next()) {
				 int itemid=result.getInt(1);
				 String itemname=result.getString(2);
				 float price=result.getFloat(3);
				 int quantity=result.getInt(4);
				 
				 System.out.println("Item Id "+itemid);
				 System.out.println("Item Name "+itemname);
				 System.out.println("Item price"+price);
				 System.out.println("Item quantity "+quantity);
				 
			
			 }
			
			}
			catch(Exception e) {
				System.out.println(e);
			}	
	}
	
	//prepared statements
	public void showRecords(int itemid)
	{
		String query="select * from items WHERE itemid=?";
		
		try {
			PreparedStatement stat= con.prepareStatement(query);
			stat.setInt(1, itemid);
			ResultSet result=stat.executeQuery();
			
			 while(result.next()) {
				 int itemid1=result.getInt(1);
				 String itemname=result.getString(2);
				 float price=result.getFloat(3);
				 int quantity=result.getInt(4);
				 
				 System.out.println("Item Id "+itemid1);
				 System.out.println("Item Name "+itemname);
				 System.out.println("Item price"+price);
				 System.out.println("Item quantity "+quantity);
			
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void insertItemData(int itemid, String itemname, int price, int quantity ) {
		
		String query="insert into items values (?,?,?,?)";
		
		try {
			
			PreparedStatement stat=con.prepareStatement(query);
			stat.setInt(1, itemid);
			stat.setString(2, itemname);
			stat.setInt(3, price);
			stat.setInt(4, quantity);
			
			int records_inserted= stat.executeUpdate();
			System.out.println(records_inserted+" records inserted");
			
		}
		catch(Exception e) {
			System.out.println(e);
		
		}
		
	}
	
	public void dropout()
	{
		try
		{
			Statement stat1 =con.createStatement();
			stat1.execute("drop table items");
		}
		catch(Exception e) {
			System.out.println(e);
		
		}
	}
	
	//batch updates
	
	public void batchQuery()
	{
		try {
			
			con.setAutoCommit(false);
			
			stat.addBatch("insert into items values(4,'Biscuit',5,20)");
			stat.addBatch("insert into items values(5,'Toffe',25,40)");
			stat.addBatch("insert into items values(6,'Cadbury',15,30)");
			stat.addBatch("insert into items values(7,'Milk Shake',50,30)");
			//stat.addBatch("update");
			int[] results=stat.executeBatch();
			con.commit();
			for(int i:results)
			{
				System.out.println(i);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
			try {
				con.rollback();
			}
			catch(Exception e1) {
				System.out.println(e1);
			
			}
		
		}
	}
	
}
