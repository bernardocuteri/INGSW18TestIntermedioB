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
			throw new RuntimeException("Esame gia' presente in carriera.");
		}
		else
		{
			carrier.add(exam);
		}
	}
	
	public int getCreditSum() {
		int credits=0;
		for(int i=0;i<carrier.size();i++) {
			credits+=carrier.get(i).getCfu();
		}
		return credits;
	}
	
	public double getWeightedSum() {
		int weightedSum=0;
		for(int i=0;i<carrier.size();i++) {
			weightedSum += (carrier.get(i).getGrade() * carrier.get(i).getCfu());
		}
		return weightedSum / getCreditSum();
	}
	
	
	

}
