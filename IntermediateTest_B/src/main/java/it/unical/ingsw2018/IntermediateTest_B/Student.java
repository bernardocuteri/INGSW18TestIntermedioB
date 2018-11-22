package it.unical.ingsw2018.IntermediateTest_B;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String nome;
	
	private List<Exam> carrier;

	public Student(String nome) {
		this.nome = nome;
		carrier = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public List<Exam> getCarrier() {
		return carrier;
	}

	public void registerExam(Exam exam) {
		if(carrier.contains(exam)) {
			throw new RuntimeException();
		}
		else
			carrier.add(exam);
	}
	public int getCreditSum() {
		int sum = 0;
		for(Exam e : carrier) {
			sum += e.getCfu();
		}
		return sum;
	}
	
	public double getWeightedSum() {
		int sum = 0;
		for(Exam e : carrier) {
			sum += e.getGrade()*e.getCfu();
		}
		return sum/getCreditSum();
	}
	
	public void clear() {
		carrier.clear();
	}
	
	
	
	

}
