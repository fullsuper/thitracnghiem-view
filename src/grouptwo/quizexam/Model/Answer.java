package grouptwo.quizexam.Model;

import java.util.HashSet;
import java.util.Set;

/**
 * Answer generated by hbm2java
 */
public class Answer implements java.io.Serializable {

	private int id;
	private Questions questions;
	private String answer;
	private Set questionses = new HashSet(0);

	public Answer() {
	}

	public Answer(int id, Questions questions, String answer) {
		this.id = id;
		this.questions = questions;
		this.answer = answer;
	}

	public Answer(int id, Questions questions, String answer, Set questionses) {
		this.id = id;
		this.questions = questions;
		this.answer = answer;
		this.questionses = questionses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Questions getQuestions() {
		return this.questions;
	}

	public void setQuestions(Questions questions) {
		this.questions = questions;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Set getQuestionses() {
		return this.questionses;
	}

	public void setQuestionses(Set questionses) {
		this.questionses = questionses;
	}

}
