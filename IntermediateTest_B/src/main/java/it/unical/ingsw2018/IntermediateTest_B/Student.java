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
		for(Exam current : carrier) {
			if(current.getName().equals(exam.getName()))
					throw new InvalidInsertionException();
		}
		
		carrier.add(exam);
	}
	
	public int getCreditSum() {
		int tot = 0;
		for(Exam exam : carrier)
			tot += exam.getCfu();
		
		return tot;
	}
	
	public double getWeightedSum() {
		double m = 0.0;
		
		for(Exam exam : carrier)
			m += exam.getGrade() * exam.getCfu();
		
		return m / this.getCreditSum();
	}

	
	
	

}
