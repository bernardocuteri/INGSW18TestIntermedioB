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
		boolean trovato = false;
		for(int i = 0 ; i < carrier.size() ; i++) {
			if(carrier.get(i).getName() == exam.getName()) {
				trovato = true;
				break;
			}	
		}
		if(trovato)
			throw new IllegalArgumentException("esame gia inserito: " + exam.getName());
		else
			carrier.add(exam);
	}
	
	public int getCreditSum() {
		int totaleCfu = 0;
		for(int i = 0 ; i < carrier.size() ; i++) {
			totaleCfu += carrier.get(i).getCfu();
		}
		
		return totaleCfu;
	}

	public double getWeightedSum() {
		double media = 0;
		int count = 0;
		
		for(int i = 0 ; i < carrier.size() ; i++) {
			media += (carrier.get(i).getGrade()*carrier.get(i).getCfu());
			count += carrier.get(i).getCfu();
		}
		
		return media/count;
	}

}
