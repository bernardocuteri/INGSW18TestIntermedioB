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

	/*
	 * Aggiunge un esame alla carriera dello studente. Non effettua l’inserimento e
	 * solleva un’eccezione nel caso in cui esista un esame in carriera con lo
	 * stesso nome di quello che si vuole inserire
	 */

	public void registerExam(Exam exam) {
		for (Exam exams : carrier) {
			if (exams.getName().equals(exam.getName()))
				throw new RuntimeException("Esame già presente");
		}
		carrier.add(exam);

	}

	/*
	 * Restituisce la somma dei crediti degli esami in carriera
	 */
	public int getCreditSum() {
		int somma = 0;
		for (Exam exam : carrier) {
			somma += exam.getCfu();
		}
		return somma;
	}
	/*
	 *  Restituisce la media pesata degli esami in
	 * carriera
	 */
	
	public double getWeightedSum() {
		double media = 0;
		for (Exam exam : carrier) {
			media += (exam.getCfu()*exam.getGrade());
		}
		
		return (media/getCreditSum());
	}

}
