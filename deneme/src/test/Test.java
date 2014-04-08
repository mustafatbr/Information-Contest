package test;

import java.util.ArrayList;

import model.Answers;
import model.Game;
import model.Player;
import model.Question;

public class Test {

	/**
	 * @param args
	 */

	private static Game game;
	
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
		
	    Question q1 = new Question("Mustafa Kemal Atat�rk��n N�fusa Kay�tl� Oldu�u �l Hangisidir? ",answerlist2);
	    Question q2 = new Question("A�a��dakilerden Hangisi D�nya Sa�l�k �rg�t�n�n K�salt�lm�� �smidir? ", answerlist3);
		Question q3 = new Question("Hangi �limizde Demiryolu Yoktur?  ", answerlist4);
		Question q4 = new Question("�Sinekli Bakkal� Roman�n�n Yazar� A�a��dakilerden Hangisidir?",  answerlist);
		
		Player p1 =  new Player("Mustafa", 0);
		  ArrayList<Question> questionlist = new ArrayList<Question>();
		questionlist.add(q1);
		questionlist.add(q2);
		questionlist.add(q3);
		questionlist.add(q4);
		game =  new Game(questionlist, p1);
		
		game.startGame();

	}
public String question1(ArrayList<Question> questionList2){
	
	return questionList2.get(0).question + questionList2.get(0).getAnswers() ;
}
public String question2(ArrayList<Question> questionList2) {

	return  questionList2.get(1).question + questionList2.get(1).getAnswers() ;
}
public String question3(ArrayList<Question> questionList2) {

	return  questionList2.get(2).question + questionList2.get(2).getAnswers() ;
}
public String question4(ArrayList<Question> questionList2) {

	return  questionList2.get(3).question + questionList2.get(3).getAnswers() ;
}

}
