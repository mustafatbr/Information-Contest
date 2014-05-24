package databaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
  
	private String className = "oracle.jdbc.driver.OracleDriver";
	private String userName = "CENG316";
	private String password = "12345";
	private String url = "jdbc:oracle:thin:@//127.0.0.1:1521/xe";
	private static ConnectionDB connectionInstance = null;
  
  public ConnectionDB(){
	  
  }
  
  public static synchronized ConnectionDB getInstance() {
	if(connectionInstance == null) {
	  connectionInstance = new ConnectionDB(); 		
	}
	return connectionInstance;
  }
  
  public Connection getConnection(){
	  
	  Connection conn = null;
	  try {
		  Class.forName(className);
		  conn = DriverManager.getConnection (url, userName, password);
		  System.out.println("Connection Established");
	  }  catch (ClassNotFoundException e) {
		  e.printStackTrace();
	  }	 catch (SQLException e) {
		  e.printStackTrace();
	  }
	  return conn;
  }

  public void closeConnection(Connection conn){
	  try {
		  conn.close();
	  } catch (SQLException e) {
		  e.printStackTrace();
	  }
  } 
}
