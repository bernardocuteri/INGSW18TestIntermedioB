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
		for (Exam e : carrier) {
			if (e.getName() == exam.getName()) throw new RuntimeException();
		}
			carrier.add(exam);
		
	}
	
	public int getCreditSum() {
		int sum = 0;
		
		for(int i = 0; i < carrier.size(); i++)
			sum += carrier.get(i).getCfu();
		
		return sum;
	}
	
	public int getWeightedSum() {
		int sum = 0, sumCfu = 0;
		
		for(int i = 0; i < carrier.size(); i++) {
			sum += (carrier.get(i).getCfu() * carrier.get(i).getGrade());
			sumCfu += carrier.get(i).getCfu();
		}
		
		return sum/sumCfu;
	}
	
	
	

}
