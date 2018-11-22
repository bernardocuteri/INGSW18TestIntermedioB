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
	
	
	public boolean contiene(String name) {		
		for(Exam e: carrier) {
			if(e.getName().equals(name))
				return true;
		}
		return false;
	}
	
	public void registerExam(Exam exam) {
		if(contiene(exam.getName()))
			throw new RuntimeException();
		else
			carrier.add(exam);
	}
	public int getCreditSum() {
		int creditSum=0;
		
		for(Exam e: carrier)
			creditSum+=e.getCfu();
		
		return creditSum;
	}
	
	
	
	public double getWeightedSum() {
		int media=0;
		int crediti=getCreditSum();
		
		for(Exam e: carrier) 
			media+=e.getGrade()*e.getCfu();
		
		
		return (double) media/crediti;
		
	}
	
	

}
