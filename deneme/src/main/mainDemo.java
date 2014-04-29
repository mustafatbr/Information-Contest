package main;

import gameview.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Answers a5 = new Answers("Bursa ", false);
		Answers a6 = new Answers("Ankara ", false);
		Answers a7 = new Answers("Ýstanbul ", false);
		Answers a8 = new Answers("Gaziantep ", true);
		ArrayList<Answers> answerlist2 = new ArrayList<Answers>();
		answerlist2.add(a5);
		answerlist2.add(a6);
		answerlist2.add(a7);
		answerlist2.add(a8);
		Question q1 = new Question("Mustafa Kemal Atatürk’ün Nüfusa Kayýtlý Olduðu Ýl Hangisidir? ",1,answerlist2);
		
		
		
		
		Answers a9 = new Answers("Uhw ", false);
		Answers a10 = new Answers("Unýcef ", false);
		Answers a11 = new Answers("Who  ",true );
		Answers a12 = new Answers("Nato ", false); 
		ArrayList<Answers> answerlist3 = new ArrayList<Answers>();
		answerlist3.add(a9);
		answerlist3.add(a10);
		answerlist3.add(a11);
		answerlist3.add(a12);
	    Question q2 = new Question("Aþaðýdakilerden Hangisi Dünya Saðlýk Örgütünün Kýsaltýlmýþ Ýsmidir? ",2, answerlist3);
		
	    
	    Answers a13 = new Answers("Batman  ", false);
		Answers a14 = new Answers("Kütahya  ", false);
		Answers a15 = new Answers("Aydýn   ", false);
		Answers a16 = new Answers("Muðla  ", true);
		ArrayList<Answers> answerlist4 = new ArrayList<Answers>();
		answerlist4.add(a13);
		answerlist4.add(a14);
		answerlist4.add(a15);
		answerlist4.add(a16);
		Question q3 = new Question("Hangi Ýlimizde Demiryolu Yoktur?  ",3, answerlist4);
		
		
		Answers a1 = new Answers("Reþat Nuri Güntekin",false );
		Answers a2 = new Answers("Halide Edip Adývar ", true);
		Answers a3 = new Answers("Ziya Gökalp ", false);
		Answers a4 = new Answers("Ömer Seyfettin ", false);
		ArrayList<Answers> answerlist = new ArrayList<Answers>();
		answerlist.add(a4);
		answerlist.add(a3);
		answerlist.add(a2);
		answerlist.add(a1);
		Question q4 = new Question("“Sinekli Bakkal” Romanýnýn Yazarý Aþaðýdakilerden Hangisidir?",4,  answerlist);
		
		
		Answers a17 = new Answers("Denizli",false );
		Answers a18 = new Answers("Ýstanbul ", true);
		Answers a19 = new Answers("Ankara ", false);
		Answers a20 = new Answers("Ýzmir", false);
		ArrayList<Answers> answerlist5 = new ArrayList<Answers>();
		answerlist5.add(a17);
		answerlist5.add(a18);
		answerlist5.add(a19);
		answerlist5.add(a20);
		Question q5 = new Question(" 2010 kültür baþkenti seçilen ilimiz hangisidir?",5,  answerlist5);
	    
	   
		Answers a21 = new Answers("11",true );
		Answers a22 = new Answers("12 ", false);
		Answers a23 = new Answers("14", false);
		Answers a24 = new Answers("7 ", false);
		ArrayList<Answers> answerlist6 = new ArrayList<Answers>();
		answerlist6.add(a21);
		answerlist6.add(a22);
		answerlist6.add(a23);
		answerlist6.add(a24);
		Question q6 = new Question("Abdullah Gül Türkiye'nin kaçýncý Cumhurbaþkanýdýr?",6,  answerlist6);
		
		
		Answers a25 = new Answers("Kimya",false );
		Answers a26 = new Answers("Genetik", false);
		Answers a27 = new Answers("Fizik", true);
		Answers a28 = new Answers("Sosyoloji", false);
		ArrayList<Answers> answerlist7 = new ArrayList<Answers>();
		answerlist7.add(a25);
		answerlist7.add(a26);
		answerlist7.add(a27);
		answerlist7.add(a28);
		Question q7 = new Question("Albert Einstein hangi bilim dalýyla uðraþmýþtýr.",7,  answerlist7);
		
		
		Answers a29 = new Answers("Makara",false );
		Answers a30 = new Answers("Matara ", true);
		Answers a31 = new Answers("Takunya", false);
		Answers a32 = new Answers("Matruþka", false);
		ArrayList<Answers> answerlist8 = new ArrayList<Answers>();
		answerlist8.add(a29);
		answerlist8.add(a30);
		answerlist8.add(a31);
		answerlist8.add(a32);
		Question q8 = new Question("Askerin su kabýna ne denir?",8,  answerlist8);
		
		
		Answers a33 = new Answers("Berlin",false );
		Answers a34 = new Answers("Ýstanbul", false);
		Answers a35 = new Answers("Strasburg", true);
		Answers a36 = new Answers("Paris", false);
		ArrayList<Answers> answerlist9 = new ArrayList<Answers>();
		answerlist9.add(a33);
		answerlist9.add(a34);
		answerlist9.add(a35);
		answerlist9.add(a36);
		Question q9 = new Question("Avrupa Parlamentosunun merkezi nerededir?",9,  answerlist9);
		
		
		
		Answers a37 = new Answers("1000 Vat",true );
		Answers a38 = new Answers("10000 Vat", false);
		Answers a39 = new Answers("100 Vat", false);
		Answers a40 = new Answers("10 Vat", false);
		ArrayList<Answers> answerlist10 = new ArrayList<Answers>();
		answerlist10.add(a37);
		answerlist10.add(a38);
		answerlist10.add(a39);
		answerlist10.add(a40);
		Question q10 = new Question("Bir Kilowat ; Kaç Vat Eder?",10,  answerlist10);
		
		
		
		Answers a41 = new Answers("20TL",false );
		Answers a42 = new Answers("10TL", true);
		Answers a43 = new Answers("100TL", false);
		Answers a44 = new Answers("200TL", false);
		ArrayList<Answers> answerlist11 = new ArrayList<Answers>();
		answerlist11.add(a41);
		answerlist11.add(a42);
		answerlist11.add(a43);
		answerlist11.add(a44);
		Question q11 = new Question("Cahit ARF'ýn kaç TL lik banknotun arkasýnda resmi vardýr?",11,  answerlist11);
		
		
		
		Answers a45 = new Answers("7",false );
		Answers a46 = new Answers("8 ", false);
		Answers a47 = new Answers("6", false);
		Answers a48 = new Answers("5", true);
		ArrayList<Answers> answerlist12 = new ArrayList<Answers>();
		answerlist12.add(a45);
		answerlist12.add(a46);
		answerlist12.add(a47);
		answerlist12.add(a48);
		Question q12 = new Question(" Cumhurbaþkanlýðý seçimi kaç yýlda bir yapýlýr?",12,  answerlist12);
		
		
		
		
		Answers a49 = new Answers("Horoz",true );
		Answers a50 = new Answers("Kartal", false);
		Answers a51 = new Answers("At", false);
		Answers a52 = new Answers("Aslan", false);
		ArrayList<Answers> answerlist13 = new ArrayList<Answers>();
		answerlist13.add(a49);
		answerlist13.add(a50);
		answerlist13.add(a51);
		answerlist13.add(a52);
		Question q13 = new Question(" Denizli Ýlinin Sembolü Ve Ayný Zamanda Bu Özelliði Ýle Tanýnan Þey Nedir?",13,  answerlist13);
		
		
		Answers a53 = new Answers("Kanuni Sultan Süleyman ",false );
		Answers a54 = new Answers("Yavuz Sultan Selim ", true);
		Answers a55 = new Answers("Orhan Bey ", false);
		Answers a56 = new Answers("Fatih Sultan Selim ", false);
		ArrayList<Answers> answerlist14 = new ArrayList<Answers>();
		answerlist14.add(a53);
		answerlist14.add(a54);
		answerlist14.add(a55);
		answerlist14.add(a56);
		Question q14 = new Question("Bir Sebepten Dolayý Tek Kulaðýna Küpe Takan Osmanlý Padiþahý Kimdir? ",14,  answerlist14);
		
		
		Answers a57 = new Answers("Ýspanya ",false );
		Answers a58 = new Answers("Fransa ", false);
		Answers a59 = new Answers("Ýngiltere ", false);
		Answers a60 = new Answers("Almanya ", true);
		ArrayList<Answers> answerlist15 = new ArrayList<Answers>();
		answerlist15.add(a57);
		answerlist15.add(a58);
		answerlist15.add(a59);
		answerlist15.add(a60);
		Question q15 = new Question(" Aþaðýdaki Ülkelerden Hangisinin Nüfusu Daha Fazladýr ",15,  answerlist15);
		
		
		Player p1 =  new Player("Mustafa", 0);
		ArrayList<Question> questionlist = new ArrayList<Question>();
		questionlist.add(q1);
		questionlist.add(q2);
		questionlist.add(q3);
		questionlist.add(q4);
		questionlist.add(q5);
		questionlist.add(q6);
		questionlist.add(q7);
		questionlist.add(q8);
		questionlist.add(q9);
		questionlist.add(q10);
		questionlist.add(q11);
		questionlist.add(q12);
		questionlist.add(q13);
		questionlist.add(q14);
		questionlist.add(q15);
		game =  new Game(questionlist, p1);
		new mainDemo();
		
		showQuestion();
	}

	public static void showQuestion() {
		// TODO Auto-generated method stub
		view.getQuestionTextArea().setText(game.getCurrentQuestion().getQuestion());
	
		for (int i = 0; i < view.getButtons().size(); i++) {
			
			view.getButtons().get(i).setText(game.getQuestions().get(game.getI()).getChoices().get(i).getAnswer());
			view.getButtons().get(i).setEnabled(true);
		}
	
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
		}else if(temp==2) {
			JOptionPane.showMessageDialog(null, "Tebrikler Bütün Sorularý Doðru Cevapladýnýz\n Büyük Ödülü Kazandýnýz!!!\n Kazandýðýnýz miktar:1000000");
			
			view.getPrize().setText(game.getPrizes()[game.getI()]+"");
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
	
}
	public mainDemo() {

		view.setVisible(true); // make visual component appear
		view.addButtonActionListener(this);
		
		view.getBtnFF().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.getBtnFF().setIcon(new ImageIcon("D:\\Yerel Disk E\\DERSLER\\3.s\u0131n\u0131f\\Software\\PROJE\\workspace\\WhoWantsToBeAMillionare\\c_50.jpg"));
				
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
				
				if(game.getI()>0){
					view.getPrize().setText(game.getPrizes()[game.getI()]+"");
				view.getPrizeAfter().setText("0");}
				else
					view.getPrize().setText("0");
				disableAllButtons();
			}

			
		});
	}
}
