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
		boolean exists = false;
		for (Exam e : carrier) {
			if (e.getName().equals(exam.getName())) 
				exists = true;
		}
		
		if(exists)
			throw new IllegalArgumentException();
		else
			carrier.add(exam);
	}

	public int getCreditSum() {
		int sum = 0;
		for (Exam e : carrier) {
			sum += e.getCfu();
		}

		return sum;
	}

	public double getWeightedSum() {

		double weightProducts = 0;

		for (Exam e : carrier) {
			weightProducts += e.getCfu() * e.getGrade();
		}

		double weightSum = 0;

		for (Exam e : carrier) {
			weightSum += e.getCfu();
		}

		return weightProducts / weightSum;
	}

}
