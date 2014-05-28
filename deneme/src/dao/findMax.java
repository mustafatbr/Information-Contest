
/*************************/
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controller.GameController;
import controller.mainDemoController;
import databaseConnection.ConnectionDB;
import gameview.view;
import model.Answers;
import model.Player;
import model.Question;
public class findMax{
	//private static view view = new view();
	
	private static mainDemoController demo;
    static String ntlabel;
	String name,m;
public findMax(String name){
	this.name=name;
}


	public String findtop(String name){
		this.name=name;
		String sql;
		int qid=0,usrid=0;
		ConnectionDB mgr = ConnectionDB.getInstance();
		Connection con = (Connection) mgr.getConnection();
		try {
			
		Statement st = con.createStatement() ;
		PreparedStatement ps;
		sql = "select USERID from USERS where USERNAME=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, name);
        ResultSet usr = ps.executeQuery();
		while (usr.next()) {
			usrid=usr.getInt("USERID");
			System.out.println(usrid);
		}
		ResultSet rec = st.executeQuery("SELECT MAX(REC) FROM RECORD WHERE USERID="+usrid);
		while (rec.next()) {
			ntlabel=rec.getString("MAX(REC)");
		    System.out.println(ntlabel);
		}
		return ntlabel;
		} catch (SQLException e) {
			return "there is a problem";
			
		}
		
	}
	
}
