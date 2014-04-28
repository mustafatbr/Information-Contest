package test;

import gameview.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import gameview.view;
import model.Answers;
import model.Game;
import model.Player;
import model.Question;
public class Test implements ActionListener {
	/**
	 * @param args
	 */
	private static Game game;
	private static view view = new view();
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Answers a1 = new Answers("Re�at Nuri G�ntekin",false );
		Answers a2 = new Answers("Halide Edip Ad�var ", true);
		Answers a3 = new Answers("Ziya G�kalp ", false);
		Answers a4 = new Answers("�mer Seyfettin ", false);
		
		Answers a5 = new Answers("Bursa ", false);
		Answers a6 = new Answers("Ankara ", false);
		Answers a7 = new Answers("�stanbul ", false);
		Answers a8 = new Answers("Gaziantep ", true);
		
		Answers a9 = new Answers("Uhw ", false);
		Answers a10 = new Answers("Un�cef ", false);
		Answers a11 = new Answers("Who  ",true );
		Answers a12 = new Answers("Nato ", false); 
		
		Answers a13 = new Answers("Batman  ", false);
		Answers a14 = new Answers("K�tahya  ", false);
		Answers a15 = new Answers("Ayd�n   ", false);
		Answers a16 = new Answers("Mu�la  ", true);
	
		ArrayList<Answers> answerlist = new ArrayList<Answers>();
		answerlist.add(a4);
		answerlist.add(a3);
		answerlist.add(a2);
		answerlist.add(a1);
		
		ArrayList<Answers> answerlist2 = new ArrayList<Answers>();
		answerlist2.add(a5);
		answerlist2.add(a6);
		answerlist2.add(a7);
		answerlist2.add(a8);
		
		ArrayList<Answers> answerlist3 = new ArrayList<Answers>();
		answerlist3.add(a9);
		answerlist3.add(a10);
		answerlist3.add(a11);
		answerlist3.add(a12);
		
		ArrayList<Answers> answerlist4 = new ArrayList<Answers>();
		answerlist4.add(a13);
		answerlist4.add(a14);
		answerlist4.add(a15);
	answerlist4.add(a16);
		
	    Question q1 = new Question("Mustafa Kemal Atat�rk��n N�fusa Kay�tl� Oldu�u �l Hangisidir? ",1,answerlist2);
	    Question q2 = new Question("A�a��dakilerden Hangisi D�nya Sa�l�k �rg�t�n�n K�salt�lm�� �smidir? ",2, answerlist3);
		Question q3 = new Question("Hangi �limizde Demiryolu Yoktur?  ",3, answerlist4);
		Question q4 = new Question("�Sinekli Bakkal� Roman�n�n Yazar� A�a��dakilerden Hangisidir?",4,  answerlist);
		
		Player p1 =  new Player("Mustafa", 0);
		  ArrayList<Question> questionlist = new ArrayList<Question>();
		questionlist.add(q1);
		questionlist.add(q2);
		questionlist.add(q3);
		questionlist.add(q4);
		game =  new Game(questionlist, p1);
		new Test();
		
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
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		int givenAnswer;
		
		if (e.getSource()==view.getBtn0()) {
			System.out.println("Btn0 is clicked ");
			givenAnswer=0;
		}else if (e.getSource()==view.getBtn1()) {
			givenAnswer=1;
			System.out.println("Btn1 is clicked ");
		}else if (e.getSource()==view.getBtn2()) {
			givenAnswer=2;
			System.out.println("Btn2 is clicked ");
		}else if (e.getSource()==view.getBtn3()) {
			givenAnswer=3;
			System.out.println("Btn3 is clicked ");
		}else{
			givenAnswer=4;
		}
		int temp=game.checkTrue(givenAnswer);
		if (temp==1) {
			showQuestion();
			System.out.println("Do�ru");
		}else if(temp==0){
			System.out.println("Yar��ma bitti");
			
			view.getPrize().setText(game.getMinimumPrize()+"");
			disableAllButtons();
		}else if(temp==2) {
			System.out.println("B�y�k �d�l� Kazand�n�z controller");
			
			view.getPrize().setText(game.getPrizes()[game.getI()]+"");
			disableAllButtons();
		}
		else
			System.out.println("di�er");
	}
	
	public void disableAllButtons() {

	for (int i = 0; i < view.getButtons().size(); i++) {
		view.getButtons().get(i).setEnabled(false);
	}
	view.getBtnFF().setEnabled(false);
	
}
	public Test() {

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
				System.out.println("Yar��madan �ekildiniz");
				
				if(game.getI()>0)
					view.getPrize().setText(game.getPrizes()[game.getI()-1]+"");
				else
					view.getPrize().setText("0");
				disableAllButtons();
			}

			
		});
	}
}
