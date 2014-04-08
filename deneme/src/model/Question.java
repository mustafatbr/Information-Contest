package model;

import java.util.ArrayList;
import java.util.Collections;

public class Question {
	
	public String question;
	public int questionLevel;
	public ArrayList<Answers> choices;
	
	public Question(String question,
			ArrayList<Answers> choices) {
		super();
		this.question = question;
        this.choices = choices;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	

	public ArrayList<Answers> getChoices() {
		return choices;
	}

	public void setChoices(ArrayList<Answers> choices) {
		this.choices = choices;
	}
	
public String  getAnswers(){
		return "\nA)" + choices.get(0).getAnswer() + "\nB)" + choices.get(1).getAnswer() + "\nC)" + choices.get(2).getAnswer() + "\nD)" + choices.get(3).getAnswer();
	}
}
