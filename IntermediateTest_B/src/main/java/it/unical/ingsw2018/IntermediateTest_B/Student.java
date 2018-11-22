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
		if(nomeGiaPresente(exam.getName()))
			throw new RuntimeException("è già presente un esame con quel nome");
		else
     		carrier.add(exam);
	}
	
	public int getCreditSum() {
		int sommaCrediti=0;
		for(Exam e:carrier) {
			sommaCrediti+=e.getCfu();
		}
		return sommaCrediti;
	}
	
	public double getWeightedSum() {
		double mediaPesata=0;
		double somma=0;
		for(Exam e:carrier) {
			somma+=e.getGrade()*e.getCfu();
		}
		mediaPesata=somma/getCreditSum();
		return mediaPesata;
	}
	
	private boolean nomeGiaPresente(String name) {
		for(Exam e:carrier) {
			if(e.getName()==name)
				return true;
		}
		return false;
	}

	
	
	
	
	
	

}
