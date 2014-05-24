package main;

import gameview.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import databaseConnection.ConnectionDB;
import gameview.view;
import model.Answers;
import model.Game;
import model.Player;
import model.Question;
public class mainDemo implements ActionListener {
	/**
	 *Dunya AZIZ
	 *Mustafa TEBER
	 */
	private static Game game;
	private static view view = new view();
static Random random;
	private static int k;
static String name;
static String ntlabel;
	

		// TODO Auto-generated method stub
		
		public mainDemo(String user) {
			name=user;
		ConnectionDB mgr = ConnectionDB.getInstance();
		Connection con = (Connection) mgr.getConnection();
		ArrayList<Question> questionlist = new ArrayList<Question>();
		try {
			
			Statement st = con.createStatement() ;
			String questionStr="",sql;
			int qid=0,usrid=0;
			
			for (int i = 1; i < 16; i++) {
				k= (int)((Math.random()*10%2)+1);
				//System.out.println(k);
				ArrayList<Answers> answerlist = new ArrayList<Answers>();
				ResultSet rs = st.executeQuery("select * from QUESTIONS where LVL="+i+"and LEVELID="+k);
				while (rs.next()) {
					questionStr=rs.getString("QUESTIONSTR");
					qid=rs.getInt("QUESTIONID");
				//	System.out.println(questionStr+"\n");
				}
				rs = st.executeQuery("select * from ANSWERS where QID="+qid);
				while (rs.next()) {
				//	System.out.println(rs.getString("ANSWER")+"\n");
					Answers a;
					if(rs.getInt("RESULT")==1)    a = new Answers(rs.getString("ANSWER"), true);
					else 				   a = new Answers(rs.getString("ANSWER"), false);
					answerlist.add(a);
				}
				
				Question q = new Question(questionStr, 1, answerlist);
				questionlist.add(q);
				rs.close();
			}
			
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
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		mgr.closeConnection(con);
		
		
		
		
		Player p1 =  new Player(name, 0);
		game =  new Game(questionlist, p1);
		mainDemo1();
		
		showQuestion();}
	
		
	

	public static void showQuestion() {
		// TODO Auto-generated method stub
		view.getQuestionTextArea().setText(game.getCurrentQuestion().getQuestion());
	
		for (int i = 0; i < view.getButtons().size(); i++) {
			
			view.getButtons().get(i).setText(game.getQuestions().get(game.getI()).getChoices().get(i).getAnswer());
			view.getButtons().get(i).setEnabled(true);
		}
		view.getNotificationLabel().setText(ntlabel);
	    view.getLblname().setText(name);
		System.out.println(ntlabel);
		view.getQuestionNum().setText((game.getI()+1)+".");
		view.getPrize().setText(game.getPrizes()[game.getI()]+"");
		view.getPrizeAfter().setText(game.getPrizes()[game.getI()+1]+"");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		int givenAnswer;
		
		if (e.getSource()==view.getBtn0()) {
		
			givenAnswer=0;
		}else if (e.getSource()==view.getBtn1()) {
			givenAnswer=1;
			
		}else if (e.getSource()==view.getBtn2()) {
			givenAnswer=2;
			
		}else if (e.getSource()==view.getBtn3()) {
			givenAnswer=3;
			
		}else{
			givenAnswer=4;
		}
		int temp=game.checkTrue(givenAnswer);
		if (temp==1) {
			if(game.getI()==5){
		JOptionPane.showMessageDialog(null, "Tebrikler Baraj sorusuna doðru cevap verdiniz\n"+"garanti edilen miktar:1000");
			}
			if(game.getI()==7){
				JOptionPane.showMessageDialog(null, "Tebrikler Baraj sorusuna doðru cevap verdiniz\n"+"garanti edilen miktar:4000");
					}
			if(game.getI()==10){
				JOptionPane.showMessageDialog(null, "Tebrikler Baraj sorusuna doðru cevap verdiniz\n"+"garanti edilen miktar:32000");
					}
			showQuestion();}
		else if(temp==0){
			
			 view.getPrize().setText(game.getMinimumPrize()+"");
			view.getPrizeAfter().setText("0");
			disableAllButtons();
//			ImageIcon icon = new ImageIcon(mainDemo.class.getResource("/lost.jpg"));
//            JOptionPane.showMessageDialog(null, "Oyunu Kaybettiniz!!", "Kaybettiniz!!", JOptionPane.INFORMATION_MESSAGE, icon);
			JOptionPane.showMessageDialog(null, "Oyunu Kaybettiniz!!\n Kazandýðýnýz tutar:"+game.getMinimumPrize()+"TL ");
			System.out.println(name);
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
           
			System.out.println(Integer.toString((int) game.getMinimumPrize()));
			m=Integer.toString((int) game.getMinimumPrize());
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
		}else if(temp==2) {
			JOptionPane.showMessageDialog(null, "Tebrikler Bütün Sorularý Doðru Cevapladýnýz\n Büyük Ödülü Kazandýnýz!!!\n Kazandýðýnýz miktar:1000000");
			
			view.getPrize().setText(game.getPrizes()[game.getI()]+"");
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
           
			System.out.println(Integer.toString((int) game.getMinimumPrize()));
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
			disableAllButtons();
		}
		else
			System.out.println("diðer");
	}
	
	public void disableAllButtons() {

	for (int i = 0; i < view.getButtons().size(); i++) {
		view.getButtons().get(i).setEnabled(false);
	}
	view.getBtnFF().setEnabled(false);
	view.getBtnExit().setEnabled(false);
}
	public void mainDemo1() {

		view.setVisible(true); // make visual component appear
		view.addButtonActionListener(this);
		
		view.getBtnFF().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "yanlýþ olan iki þýk sizin için kaldýrýlýyor!!!");
				view.getBtnFF().setIcon(new ImageIcon("C:\\Users\\ASUS\\git\\Information Contest\\deneme\\c_50.jpg"));
				
				if(game.getjoker()==false){
				int disableBtn[]=(game.useFF());
				view.getButtons().get(disableBtn[0]).setEnabled(false);
				view.getButtons().get(disableBtn[1]).setEnabled(false);
				}
			}
		});

		view.getBtnExit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Yarýþmadan Çekildiniz");
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
	           
				System.out.println(Integer.toString((int)game.getPrizes()[game.getI()]));
				m=Integer.toString((int) game.getPrizes()[game.getI()]);
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
				
				if(game.getI()>0){
					view.getPrize().setText(game.getPrizes()[game.getI()]+"");
					view.getPrizeAfter().setText(game.getPrizes()[game.getI()]+"");
					
					JOptionPane.showMessageDialog(null, "Yarýþmadan çekildiniz!!!\n kazandýðýnýz miktar:"+game.getPrizes()[game.getI()]+"TL");
					;}
				else
					view.getPrize().setText("0");
				disableAllButtons();
			}

			
		});
	}
}
