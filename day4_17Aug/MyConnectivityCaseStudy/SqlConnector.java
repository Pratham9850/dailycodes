package jdbs.MyConnectiveCaseStudy;

import java.sql.*;

public class SqlConnector {
	
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
		
		String query="create table callquality(callid int primary key, phoneno varchar(20),callfeedback varchar(30),callrating int, customername varchar(20),calldroprate int)";
		
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
		//String insertCommand="insert into callquality values(1,'9934223221','getting frequent call drops',2,'Erric Jones',35)";
		//String insertCommand="insert into callquality values(2,'8873433421','call drops happening',3,'Mathew Mandis',32)";
		//String insertCommand="insert into callquality values(3,'89654325','getting call grops',5,'Peter Jones',39)";
		//String insertCommand="insert into callquality values(4,'9123456780','good',5,'James Evans',29)";
		String insertCommand="insert into callquality values(5,'9780654321','well calls',4,'Tom Jones',34)";
		
		
		try {
		 
		 int recordsaffected= stat.executeUpdate(insertCommand);
		 System.out.println("record inserted "+recordsaffected);
		 
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public void getRecords(){
		String query="Select * from callquality";
		try {
			 ResultSet result=stat.executeQuery(query);
			 while(result.next()) {
				 int callid=result.getInt(1);
				 String phoneno=result.getString(2);
				 String callfeedback=result.getString(3);
				 int callrating=result.getInt(4);
				 String customername=result.getString(5);
				 int calldroprate=result.getInt(6);
				  
				 System.out.println("Call Id: "+callid);
				 System.out.println("Phone no: "+phoneno);
				 System.out.println("Call feedback: "+callfeedback);
				 System.out.println("Call rating: "+callrating);
				 System.out.println("Customer Name: "+customername);
				 System.out.println("Call droprate: "+calldroprate);
			
			 }
			
			}
			catch(Exception e) {
				System.out.println(e);
			}		
				
	}
	
	public void updateRecords(){
		String query="UPDATE callquality SET calldroprate =25 WHERE callid=2;";
		
		try {
			
			 
			 int recordsaffected1= stat.executeUpdate(query);
			 System.out.println("record updates "+recordsaffected1);
			 
			}
			catch(Exception e) {
				System.out.println(e);
			}		
				
	}
	
	
	
	public void selectRecords() {
		
		//String query="Select * from callquality where calldroprate<30";
		//String query="Select * from callquality where callfeedback>4";
		String query="Select * from callquality where CHAR_LENGTH(phoneno)<10";
		
		
		try {
			 ResultSet result=stat.executeQuery(query);
			 while(result.next()) {
				 int callid=result.getInt(1);
				 String phoneno=result.getString(2);
				 String callfeedback=result.getString(3);
				 int callrating=result.getInt(4);
				 String customername=result.getString(5);
				 int calldroprate=result.getInt(6);
				  
				 System.out.println("Call Id: "+callid);
				 System.out.println("Phone no: "+phoneno);
				 System.out.println("Call feedback: "+callfeedback);
				 System.out.println("Call rating: "+callrating);
				 System.out.println("Customer Name: "+customername);
				 System.out.println("Call droprate: "+calldroprate);
			
			 }
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}
	
	
public void insertItemData(int callid, String phoneno, String callfeedback, int callrating, String customername, int calldroprate ) {
		
		String query="insert into callquality values (?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement stat=con.prepareStatement(query);
			stat.setInt(1, callid);
			stat.setString(2, phoneno);
			stat.setString(3, callfeedback);
			stat.setInt(4, callrating);
			stat.setString(5, customername);
			stat.setInt(6, calldroprate);
			
			int records_inserted= stat.executeUpdate();
			System.out.println(records_inserted+" records inserted");
			
		}
		catch(Exception e) {
			System.out.println(e);
		
		}
		
	}
	
	public void update_Records(int calldroprate, int callid){
		
		String query ="UPDATE callquality SET calldroprate=? WHERE callid=?";
		
		try {
			
			 
			PreparedStatement stat=con.prepareStatement(query);
			stat.setInt(1, calldroprate);
			stat.setInt(2, callid);
			
			
			int records_updated= stat.executeUpdate();
			System.out.println(records_updated+" records updated");
			 
			}
			catch(Exception e) {
				System.out.println(e);
			}		
				
	}
	
public void select_Records(int calldroprate) {
		
		
		String query="Select * from callquality where calldroprate>?";
		
		
			
		try {
			PreparedStatement stat= con.prepareStatement(query);
			stat.setInt(1, calldroprate);
		
			 ResultSet result=stat.executeQuery();
			 
			 while(result.next()) {
				 int callid=result.getInt(1);
				 String phoneno=result.getString(2);
				 String callfeedback=result.getString(3);
				 int callrating=result.getInt(4);
				 String customername=result.getString(5);
				 int calldroprate1=result.getInt(6);
				  
				 System.out.println("Call Id: "+callid);
				 System.out.println("Phone no: "+phoneno);
				 System.out.println("Call feedback: "+callfeedback);
				 System.out.println("Call rating: "+callrating);
				 System.out.println("Customer Name: "+customername);
				 System.out.println("Call droprate: "+calldroprate1);
			
			 }
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}
	
	

}
