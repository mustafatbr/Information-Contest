package controller;

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

import dao.findMax;
import dao.getQuestionDao;
import dao.saveDaoTop;
import dao.saveDaoWrong;
import dao.savedao;
import databaseConnection.ConnectionDB;
import gameview.view;
import model.Answers;
import model.Player;
import model.Question;
public class mainDemoController implements ActionListener {
	/**
	 *Dunya AZIZ
	 *Mustafa TEBER
	 */
	private static GameController game;
	//private static saveDaoTop yarfinal;
	public static savedao yarcek;
	
	private static view view = new view();
    static Random random;
	private static int k;
    static String name;
    static String ntlabel;
	

		// TODO Auto-generated method stub
		
		public mainDemoController(String user) {
		name=user;

            findMax findRecord= new findMax(name);
			
            ntlabel= findRecord.findtop(name);


            ArrayList<Question> questionlist = new ArrayList<Question>();
            getQuestionDao getQuestion= new getQuestionDao(name);
            questionlist=getQuestion.buildquestion();
		Player p1 =  new Player(name, 0);
		game =  new GameController(questionlist, p1);
		mainDemo1();
		
		showQuestion();}
	
	public static void showQuestion() {
		// TODO Auto-generated method stub
		view.getQuestionTextArea().setText(game.getCurrentQuestion().getQuestion());
		view.getBtnFF().setEnabled(true);
		view.getBtnExit().setEnabled(true);
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
		//A
			givenAnswer=0;
		}else if (e.getSource()==view.getBtn1()) {
			givenAnswer=1;
			//B
		}else if (e.getSource()==view.getBtn2()) {
			givenAnswer=2;
			//C
		}else if (e.getSource()==view.getBtn3()) {
			givenAnswer=3;
			//D
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
			JOptionPane.showMessageDialog(null, "Oyunu Kaybettiniz!!\n Kazandýðýnýz tutar:"+game.getMinimumPrize()+"TL ");
			System.out.println(name);
			 String a=Integer.toString((int) game.getMinimumPrize());
			saveDaoWrong wrongAnswer	= new saveDaoWrong(name);
			wrongAnswer.saveWrong(name,a);
		}else if(temp==2) {
			JOptionPane.showMessageDialog(null, "Tebrikler Bütün Sorularý Doðru Cevapladýnýz\n Büyük Ödülü Kazandýnýz!!!\n Kazandýðýnýz miktar:1000000");
			
			view.getPrize().setText(game.getPrizes()[game.getI()]+"");
			saveDaoTop yarfinal	= new saveDaoTop(name);
			
			yarfinal.savetop(name);

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
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		mainDemoController.name = name;
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

		
		view.getBtnTekrarOyna().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                    view.setVisible(false);
                     	  
                    view.dispose();
			     	game.setI(0);
				  new mainDemoController(name);
			}
		});
		view.getBtnExit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Yarýþmadan Çekildiniz");
				yarcek= new savedao(name);
				 String a=Integer.toString((int) game.getPrizes()[game.getI()]);
				yarcek.saveyar(name,a);

				
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
