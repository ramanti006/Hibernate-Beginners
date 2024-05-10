package com.map;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer {
	
	@Id
	private int ans_id;
	
	private String ans;
	
	@OneToOne(mappedBy = "answer",cascade = CascadeType.ALL)
	private Question qus;

	
	public Question getQus() {
		return qus;
	}

	public void setQus(Question qus) {
		this.qus = qus;
	}

	public Answer(int ans_id, String ans, Question qus) {
		super();
		this.ans_id = ans_id;
		this.ans = ans;
		this.qus = qus;
	}

	public Answer() {
		super();
	}

	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Answer [ans_id=" + ans_id + ", ans=" + ans + ", qus=" + qus + "]";
	}

	
	

}
