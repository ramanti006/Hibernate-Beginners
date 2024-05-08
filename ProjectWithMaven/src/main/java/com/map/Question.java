package com.map;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Question")
public class Question {
	
	@Id
	private int qus_id;
	private String Question;
	
	@OneToOne
	@JoinColumn(name="answer_id")
	private Answer answer;

	
	public Question() {
		super();
	}


	public Question(int qus_id, String question, Answer answer) {
		super();
		this.qus_id = qus_id;
		Question = question;
		this.answer = answer;
	}


	public int getQus_id() {
		return qus_id;
	}


	public void setQus_id(int qus_id) {
		this.qus_id = qus_id;
	}


	public String getQuestion() {
		return Question;
	}


	public void setQuestion(String question) {
		Question = question;
	}


	public Answer getAns() {
		return answer;
	}


	public void setAns(Answer answer) {
		this.answer = answer;
	}


	@Override
	public String toString() {
		return "Question [qus_id=" + qus_id + ", Question=" + Question + ", ans=" + answer + "]";
	}
	
	

	
	
}
