package model;

import gameview.view;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

import javax.swing.ImageIcon;

import test.Test;
public class Game {
	private Test question; 
	private final int JOKER=3;
	private int i,number;
	private ArrayList<Question> questions;
	private Player player;
	private Boolean joker;
	Random random;
	private long minimumPrize;
	private int userAnswer;
	private Question currentQuestion;
	private long prizes[] = {0,100, 200, 300, 500};
	 ArrayList check = new ArrayList();
	
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
	
	public void nextQuestion(){
		setCurrentQuestion(questions.get(i));
//		Scanner input = new Scanner(System.in);
//		System.out.println(getCurrentQuestion());
//		String str = input.nextLine();
//		if(str.equalsIgnoreCase("a"))
//			userAnswer = 0;
//		else if(str.equalsIgnoreCase("b"))
//			userAnswer = 1;
//		else if(str.equalsIgnoreCase("c"))
//			userAnswer = 2;
//		else if(str.equalsIgnoreCase("d"))
//			userAnswer = 3;
//		
//		checkTrue();
		
	}
	
	public int checkTrue(int answer){
		if(answer<4){
			if(questions.get(i).getChoices().get(answer).getIsAnswerTrue()){
				i++;
				System.out.println("Do�ru cevap");
				System.out.println("Kazan�lan �d�l " + prizes[i] + " TL");
				checkBarage();
				
				System.out.println("seviye:"+i);
				
				if(i==4){
					System.out.println("B�y�k �d�l� kazand�n�z. Yar��mam�z burada sona eriyor.");
					return 2;
				}else{
					//nextQuestion();
					currentQuestion=questions.get(i);
					return 1;
				}
			}else{
				System.out.println("Yanl�� cevap");
				System.out.println("Kazan�lan �d�l: "+minimumPrize);
				if(i>=2){
					minimumPrize=prizes[2];
				}
				return 0;
			}
		
		}else if(answer==JOKER && !joker){
			
			useFiftyFifty();
			System.out.println("yar� yar�ya jokeri kullan�ld�");
		joker=true;
			//nextQuestion();
			return 3;
			
		}else{
			System.out.println("Bu jokeri daha �nce kulland�n�z veya yanl�� karakter girdiniz.");
			//nextQuestion();
			return 4;
		}
	}
	private void checkBarage() {
		// TODO Auto-generated method stub
		if(i>=2){
			minimumPrize=prizes[2];
		}
	}
	public void startGame(){
		System.out.println("Welcome Mr. "+player.getName()+" Games Are Starting...\n");
		nextQuestion();
	}

	public int[] useFiftyFifty() {
		
		
		int falseOne=findFalseAnswer(4);
		int falseTwo=findFalseAnswer(falseOne);
		int ff[]={falseOne,falseTwo};
		
		//System.out.println("yanl�� iki cevap: "+questionList.get(currentLevel).getChoices().get(falseOne).getAnswerStr() +" ve "+questionList.get(currentLevel).getChoices().get(falseTwo).getAnswerStr());
		joker=true;
		return ff;
	
		}
	
	public int findFalseAnswer(int falseOne){
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
