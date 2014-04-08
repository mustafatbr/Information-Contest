package model;

public class Answers {
	
	public String answer;
	public Boolean isAnswerTrue;
	
	public Answers(String answer, Boolean isAnswerTrue) {
		super();
		this.answer = answer;
		this.isAnswerTrue = isAnswerTrue;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answerStr) {
		this.answer = answerStr;
	}

	public Boolean getIsAnswerTrue() {
		return isAnswerTrue;
	}

	public void setIsAnswerTrue(Boolean isAnswerTrue) {
		this.isAnswerTrue = isAnswerTrue;
	}
	
	
	
	

}
