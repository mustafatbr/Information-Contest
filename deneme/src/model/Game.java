package model;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

import test.Test;
public class Game {
	public Test question; 
	public int i,number;
	public ArrayList<Question> questions;
	public Player player;
	public Boolean joker;
	public int userAnswer;
	private long prizes[] = {100, 200, 300, 500};
	 ArrayList check = new ArrayList();
	
	
		
		public Game(ArrayList<Question> questions, Player player) {
			super();
			this.questions = questions;
			this.player = player;
			this.i=0;
		}

	public int getI() {
		return i;
	}

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
	
	
	public void nextQuestion(){
		Scanner input = new Scanner(System.in);
		 question=new Test();
			Random random = new Random();
		       number = random.nextInt(4);
		       while(check.contains(number))
		       {
		            number = random.nextInt(4);
		       }
		       check.add(number);
		
		          switch(number)
		          {
		           case 0:
		               
		              System.out.println(question.question1(questions)); 
		          break;
		            case 1:
		               
		            	 System.out.println(question.question2(questions));
		            	 break;
		            case 2:
		               
		            	 System.out.println(question.question3(questions));
		            	 break;
		            case 3:
		               
		            	 System.out.println(question.question4(questions));
		            	 break;
		            	
		        
		}
		
		
		
		String answer = input.nextLine();
		if(answer.equalsIgnoreCase("a"))
			userAnswer = 0;
		else if(answer.equalsIgnoreCase("b"))
			userAnswer = 1;
		else if(answer.equalsIgnoreCase("c"))
			userAnswer = 2;
		else if(answer.equalsIgnoreCase("d"))
			userAnswer = 3;
		
		checkTrue();
		
	}
	
	public void checkTrue(){
		if(questions.get(number).choices.get(userAnswer).isAnswerTrue){
			System.out.println("Correct Answer");
			System.out.println("Awards Won " + prizes[i] + " TL");
			i++;
					if(i==4){
							System.out.println("You've Won The Grand Prize. Our Contest Ends Here.");
							}else{
							nextQuestion();
							}
		}else
			System.out.println("Wrong Answer!!!\nplease try next time:)");
	}
	
	public void startGame(){
		System.out.println("Welcome Mr. "+player.getName()+" Games Are Starting...\n");
		nextQuestion();
	}

	
}
