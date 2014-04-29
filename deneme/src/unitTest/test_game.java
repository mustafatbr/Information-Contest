package unitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import model.Answers;
import model.Game;
import model.Player;
import model.Question;

import org.junit.Test;

public class test_game {

	@Test
	public void test() {
		//control the first question's answer control is true
         Game game;
		 Player p1 =  new Player("Dünya", 0);
		 ArrayList<Question> questionlist = new ArrayList<Question>();
		
		 Answers a1 = new Answers("Reþat Nuri Güntekin",false );
			Answers a2 = new Answers("Halide Edip Adývar ", true);
			Answers a3 = new Answers("Ziya Gökalp ", false);
			Answers a4 = new Answers("Ömer Seyfettin ", false);
			
			Answers a5 = new Answers("Bursa ", false);
			Answers a6 = new Answers("Ankara ", false);
			Answers a7 = new Answers("Ýstanbul ", false);
			Answers a8 = new Answers("Gaziantep ", true);
			
			Answers a9 = new Answers("Uhw ", false);
			Answers a10 = new Answers("Unýcef ", false);
			Answers a11 = new Answers("Who  ",true );
			Answers a12 = new Answers("Nato ", false); 
			
			Answers a13 = new Answers("Batman  ", false);
			Answers a14 = new Answers("Kütahya  ", false);
			Answers a15 = new Answers("Aydýn   ", false);
			Answers a16 = new Answers("Muðla  ", true);
		
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
			
		    Question q1 = new Question("Mustafa Kemal Atatürk’ün Nüfusa Kayýtlý Olduðu Ýl Hangisidir? ",1,answerlist2);
		    Question q2 = new Question("Aþaðýdakilerden Hangisi Dünya Saðlýk Örgütünün Kýsaltýlmýþ Ýsmidir? ",2, answerlist3);
			Question q3 = new Question("Hangi Ýlimizde Demiryolu Yoktur?  ",3, answerlist4);
			Question q4 = new Question("“Sinekli Bakkal” Romanýnýn Yazarý Aþaðýdakilerden Hangisidir?",4,  answerlist);
			
		
			
			
		questionlist.add(q1);
		questionlist.add(q2);
		questionlist.add(q3);
		questionlist.add(q4);
        game =  new Game(questionlist, p1);
        game.setI(1);
        game.setJoker(false);
		assertEquals(0,Game.checkTrue(3));	        
	}
	
	@Test
	public void test2() {
		//control the first question's answer control is true
         Game game;
		 Player p1 =  new Player("Dünya", 0);
		 ArrayList<Question> questionlist = new ArrayList<Question>();
		
		 Answers a1 = new Answers("Reþat Nuri Güntekin",false );
			Answers a2 = new Answers("Halide Edip Adývar ", true);
			Answers a3 = new Answers("Ziya Gökalp ", false);
			Answers a4 = new Answers("Ömer Seyfettin ", false);
			
			Answers a5 = new Answers("Bursa ", false);
			Answers a6 = new Answers("Ankara ", false);
			Answers a7 = new Answers("Ýstanbul ", false);
			Answers a8 = new Answers("Gaziantep ", true);
			
			Answers a9 = new Answers("Uhw ", false);
			Answers a10 = new Answers("Unýcef ", false);
			Answers a11 = new Answers("Who  ",true );
			Answers a12 = new Answers("Nato ", false); 
			
			Answers a13 = new Answers("Batman  ", false);
			Answers a14 = new Answers("Kütahya  ", false);
			Answers a15 = new Answers("Aydýn   ", false);
			Answers a16 = new Answers("Muðla  ", true);
		
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
			
		    Question q1 = new Question("Mustafa Kemal Atatürk’ün Nüfusa Kayýtlý Olduðu Ýl Hangisidir? ",1,answerlist2);
		    Question q2 = new Question("Aþaðýdakilerden Hangisi Dünya Saðlýk Örgütünün Kýsaltýlmýþ Ýsmidir? ",2, answerlist3);
			Question q3 = new Question("Hangi Ýlimizde Demiryolu Yoktur?  ",3, answerlist4);
			Question q4 = new Question("“Sinekli Bakkal” Romanýnýn Yazarý Aþaðýdakilerden Hangisidir?",4,  answerlist);
			
		
			
			
		questionlist.add(q1);
		questionlist.add(q2);
		questionlist.add(q3);
		questionlist.add(q4);
        game =  new Game(questionlist, p1);
        game.setI(1);
        game.setJoker(false);
		assertEquals(1,Game.checkTrue(2));	        
	}

}
