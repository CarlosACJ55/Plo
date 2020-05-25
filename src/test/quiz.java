package test;

public class quiz implements java.io.Serializable {
	
	int code;
	String Question;
	String [] answers = new String[5];
	int correct_answer;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String[] getAnswers() {
		return answers;
	}
	public void setAnswers(String[] answers) {
		this.answers = answers;
	}
	public int getCorrect_answer() {
		return correct_answer;
	}
	public void setCorrect_answer(int correct_answer) {
		this.correct_answer = correct_answer;
	}
	
	
	

	

}
