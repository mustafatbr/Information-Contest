/*************************/
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.GameController;
import controller.mainDemoController;
import databaseConnection.ConnectionDB;
import gameview.view;
import model.Answers;
import model.Player;
import model.Question;
public class saveDaoTop{
	//private static view view = new view();
	
	private static mainDemoController demo;
	
	String name,m;
public saveDaoTop(String name){
	this.name=name;
}


	public void savetop(String name){
		this.name=name;
		
		ConnectionDB mgr = ConnectionDB.getInstance();
		Connection con = (Connection) mgr.getConnection();
		PreparedStatement ps;
		String sql,m;
		try {	
		int usrid=0;
		
		
		
		sql = "select USERID from USERS where USERNAME=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, name);
        ResultSet usr = ps.executeQuery();
		while (usr.next()) {
			usrid=usr.getInt("USERID");
			System.out.println("user idm"+usrid);
		}
		String str = "insert into RECORD(USERID,REC) values(?,?)";
       
		
		m="1000000";
			ps = con.prepareStatement(str);
			
			ps.setInt(1, usrid); 
		    ps.setString(2, m );
		    ps.executeUpdate();
		}
		 catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	mgr.closeConnection(con);
		
	}
	
}
