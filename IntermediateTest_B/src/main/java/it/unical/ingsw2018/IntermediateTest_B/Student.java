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
	
	/**
	 * Aggiunge un esame alla carriera dello studente. 
	 * Non effettua l’inserimento e solleva un’eccezione 
	 * nel caso in cui esista un esame in carriera 
	 * con lo stesso nome di quello che si vuole inserire
	 * @param exam esame da inserire
	 */
	public void registerExam(Exam exam) {
		boolean esiste = false;
		for(Exam i : carrier) {
			if(i.getName() == exam.getName())
				esiste = true;
		}
		
		if(!esiste) {
			carrier.add(exam);
		}
		else throw new RuntimeException("L' esame che si vuole inserire esistee già!");
	}
	
	/**
	 * Restituisce la somma dei crediti degli esami in carriera	
	 * @return somma
	 */
	public int getCreditSum() {
		int sum = 0;
		for(Exam i : carrier) {
			sum+=i.getCfu();
		}
		return sum;
	}
	
	
	/**
	 * Restituisce la media pesata degli 
	 * esami in carriera
	 * @return media pesata
	 */
	public double getWeightedSum() {
		double sum = 0, weightSum = 0;
		for(Exam i : carrier) {
			sum += i.getGrade()*i.getCfu(); // voto per peso in crediti
			weightSum += i.getCfu(); // somma dei crediti (i pesi)
		}
		return sum / weightSum;
	}

	
	
	
	
	
	

}
