
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controller.GameController;
import controller.mainDemoController;
import databaseConnection.ConnectionDB;
import gameview.view;
import model.Answers;
import model.Player;
import model.Question;
public class getQuestionDao{
	//private static view view = new view();
	
	private static mainDemoController demo;
	
	String name,m;
public getQuestionDao(String name){
	this.name=name;
}


	public  ArrayList<Question> buildquestion(){
		
		ConnectionDB mgr = ConnectionDB.getInstance();
		Connection con = (Connection) mgr.getConnection();
		ArrayList<Question> questionlist = new ArrayList<Question>();
		try {
			
			Statement st = con.createStatement() ;
			String questionStr="",sql;
			int qid=0,usrid=0;
			
			for (int i = 1; i < 16; i++) {
				int k = (int)((Math.random()*10%2)+1);
				System.out.println(k);
				//System.out.println(k);
				ArrayList<Answers> answerlist = new ArrayList<Answers>();
				ResultSet rs = st.executeQuery("select * from QUESTIONS where LVL="+i+"and LEVELID="+k);
				while (rs.next()) {
					questionStr=rs.getString("QUESTIONSTR");
					qid=rs.getInt("QUESTIONID");
					System.out.println(questionStr+"\n");
				}
				rs = st.executeQuery("select * from ANSWERS where QID="+qid);
				while (rs.next()) {
					System.out.println(rs.getString("ANSWER")+"\n");
					Answers a;
					if(rs.getInt("RESULT")==1){    a = new Answers(rs.getString("ANSWER"), true);
					System.out.println(rs.getInt("RESULT"));}
					else 				   a = new Answers(rs.getString("ANSWER"), false);
					answerlist.add(a);
				}
				
				Question q = new Question(questionStr, 1, answerlist);
				questionlist.add(q);
				rs.close();
			}
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		mgr.closeConnection(con);
		
		
		return questionlist;
		
	}
	}