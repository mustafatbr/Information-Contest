package model;

import gameview.view;

import java.util.ArrayList;

import java.util.Random;

import javax.swing.ImageIcon;

import main.mainDemo;
public class Game {
 
	private final static int JOKER=3;
	private static int i,number;
	private  static ArrayList<Question> questions;
	private static Player player;
	private static Boolean joker;
	static Random random;
	private static long minimumPrize;
	private int userAnswer;
	private static Question currentQuestion;
	private static long prizes[] = {0,100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 125000, 250000, 500000, 1000000};
	
	
	 private static view view = new view();
		
		public Game(ArrayList<Question> questions, Player player) {
			super();
			this.questions = questions;
			this.player = player;
			joker=false;
			this.i=0;
			random=new Random();
			minimumPrize=0;
			setCurrentQuestion(questions.get(0));
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public Boolean getJoker() {
			return joker;
		}
		public void setJoker(Boolean joker) {
			this.joker = joker;
		}

		public Question getCurrentQuestion() {
			return questions.get(i);
		}

		public void setCurrentQuestion(Question currentQuestion) {
			this.currentQuestion = currentQuestion;
		}

	public int getI() {
		return i;
	}
// i is the playerlevel
	public void setI(int i) {
		this.i = i;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Boolean getjoker() {
		return joker;
	}

	public void setjoker(Boolean joker) {
		this.joker = joker;
	}

		public int getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(int userAnswer) {
		this.userAnswer = userAnswer;
	}
	
	public long[] getPrizes() {
		return prizes;
	}

	public void setPrizes(long[] prizes) {
		this.prizes = prizes;
	}
	
	
public String getCurrentQuestionline(){
		
	return questions.get(getI()).getQuestion() + questions.get(getI()).getAnswers() ;
	}
	
	
	
	public static int checkTrue(int answer){
		if(answer<4){
			if(questions.get(i).getChoices().get(answer).getIsAnswerTrue()){
				i++;
				System.out.println("Doðru cevap");
				System.out.println("Kazanýlan Ödül " + prizes[i] + " TL");
				checkBarage();
				
				System.out.println("seviye:"+i);
				
				if(i==15){
					System.out.println("Büyük Ödülü kazandýnýz. Yarýþmamýz burada sona eriyor.");
					return 2;
				}else{
					
					currentQuestion=questions.get(i);
					return 1;
				}
			}else{
				System.out.println("Yanlýþ cevap");
				System.out.println("Kazanýlan Ödül: "+minimumPrize);
				if(i>=5&&i<10){
					minimumPrize=prizes[5];
				}
				else if(i>=7&&i<10)
				{
					minimumPrize=prizes[7];
				}
				else if(i>=10&&i<13)
				{
					minimumPrize=prizes[10];
				}
				return 0;
			}
		
		}else{
			System.out.println("Bu jokeri daha önce kullandýnýz veya yanlýþ karakter girdiniz.");
			
			return 4;
		}
	}
	private static void checkBarage() {
		// TODO Auto-generated method stub
		if(i>=5&&i<10){
			minimumPrize=prizes[5];
		}
		else if(i>=7&&i<10)
		{
			minimumPrize=prizes[7];
		}
		else if(i>=10&&i<13)
		{
			minimumPrize=prizes[10];
		}
	}


	public static int[] useFF() {
		
		
		int falseOne=findFalseAnswer(4);
		int falseTwo=findFalseAnswer(falseOne);
		int ff[]={falseOne,falseTwo};
		
		joker=true;
		return ff;
	
		}
	
	public static int findFalseAnswer(int falseOne){
		int r = random.nextInt(4);
		if(questions.get(i).getChoices().get(r).getIsAnswerTrue() || r==falseOne){
			return findFalseAnswer(falseOne);
		}else{
			return r;
		}
	}
	public long getMinimumPrize() {
		return minimumPrize;
	}
	public void setMinimumPrize(long minimumPrize) {
		this.minimumPrize = minimumPrize;
	}

	
}
