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
	
	public void registerExam(Exam ex) {
		for (Exam e : carrier) {
			if (e.getName() == ex.getName()) throw new RuntimeException();
		}
		carrier.add(ex);
	}
	
	public int getCreditSum() {
		int sum = 0;
		for (Exam e : carrier) {
			sum += e.getCfu();
		}
		return sum;
	}
	
	public double getWeightedSum()  {
		double mediaPesata;
		double sommaPesi = 0;
		double sommaMedie = 0;
		for (Exam e : carrier) {
			sommaPesi += e.getCfu();
			sommaMedie += e.getGrade()*e.getCfu();
		}
		mediaPesata = sommaMedie / sommaPesi;
		return mediaPesata;
	}

	
	
	
	
	
	

}
